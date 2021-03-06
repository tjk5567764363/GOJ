package com.gzu.taurus.goj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.bll.bo.sys.interfaces.SysEventQueueBO;
import com.gzu.taurus.goj.bll.bo.user.interfaces.UserBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.common.enums.Submit.Verdict;
import com.gzu.taurus.goj.common.enums.SysEventQueue.EventType;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;
import com.gzu.taurus.goj.dal.dataobject.sys.SysEventQueueDO;
import com.gzu.taurus.goj.dal.dataobject.user.UserDO;

/**
 * StatusController
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月5日
 */
@RestController
@RequestMapping("/status")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StatusController extends BaseController {
	@Autowired
	private SubmitBO submitBO;

	@Autowired
	private UserBO userBO;

	@Autowired
	private SysEventQueueBO sysEventQueueBO;

	@Autowired
	private Shell s;

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ModelAndView createStatus(@PathVariable("id") Long id, SubmitDO query) {
		SubmitDO submitTemp = new SubmitDO();
		submitTemp.setUser_id(getLoginUserId());
		submitTemp.setProblem_id(id);
		submitTemp.setLanguage(query.getLanguage());
		submitTemp.setSource_code(query.getSource_code());
		submitTemp.setLength(query.getSource_code().length());
		submitTemp.setType(query.getType());
		Long submitId = submitBO.createSubmit(submitTemp);

		/************* Judge 之后考虑放在task *************/
		boolean result = s.judge(submitId);
		/************************************************/

		/***
		SysEventQueueDO eventQueueTemp = new SysEventQueueDO();
		eventQueueTemp.setUser_id(getLoginUserId());
		eventQueueTemp.setEvent_type(EventType.JUDGE.getValue());
		sysEventQueueBO.createSysEventQueue(eventQueueTemp);
		**/

		UserDO userTemp = new UserDO();
		userTemp.setId(getLoginUserId());
		if (result) {
			SubmitDO submiQuery = new SubmitDO();
			submiQuery.setUser_id(getLoginUserId());
			submiQuery.setProblem_id(id);
			submiQuery.setVerdict(Verdict.Accepted.getValue());
			if (submitBO.getSubmitCount(submiQuery) == 0) {
				userTemp.setSolved(1);
			}
		}
		userTemp.setSubmit(1);
		userBO.modifyUser(userTemp);

		return getMavRedir(WebConstant.REDIRECTSTATUS);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getStatus(@PathVariable("id") Long id, Model model) {
		SubmitDO submitQuery = new SubmitDO();
		submitQuery.setId(id);
		submitBO.getSubmit(submitQuery);

		return getMav(WebConstant.STATUS);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView findStatuss() {
		List<SubmitDO> list = submitBO.findSubmits(new SubmitDO());

		return getMav(WebConstant.STATUS).addObject("statusList", list);
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav.addObject(WebConstant.MENU, WebConstant.STATUS);
	}
}
