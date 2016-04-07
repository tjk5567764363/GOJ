package com.gzu.taurus.goj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.taurus.goj.bll.bo.share.interfaces.ShareBO;
import com.gzu.taurus.goj.common.constant.WebConstant;
import com.gzu.taurus.goj.dal.dataobject.share.ShareDO;

/**
 * ShareController
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
@RestController
@RequestMapping("/share")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ShareController extends BaseController {
	@Autowired
	private ShareBO shareBO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView share() {
		return getMav(WebConstant.SHARE);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getShare(@PathVariable("id") Long id) {
		ShareDO shareDB = shareBO.getShare(new ShareDO(id));

		return getMav(WebConstant.SHARECONTENT).addObject("share", shareDB);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView createShare(ShareDO share) {

		ShareDO shareTemp = new ShareDO();
		shareTemp.setUser_id(getLoginUserId());
		shareTemp.setTitle(share.getTitle());
		shareTemp.setSyntax(share.getSyntax());
		shareTemp.setTheme(share.getTheme());
		shareTemp.setContent(share.getContent());

		Long id = shareBO.createShare(shareTemp);

		return getMavRedir(String.format(WebConstant.REDIRECTSHARECONTENT, id));
	}

	@Override
	ModelAndView doMav(ModelAndView mav) {
		return mav.addObject(WebConstant.MENU, WebConstant.SHARE);
	}

}
