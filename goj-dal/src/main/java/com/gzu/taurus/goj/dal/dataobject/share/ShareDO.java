package com.gzu.taurus.goj.dal.dataobject.share;

import com.gzu.taurus.goj.dal.dataobject.BaseDO;

/**
 * ShareDO
 *
 * @Author tangjunkai
 * @CreateDate 2016年4月7日
 */
public class ShareDO extends BaseDO {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** Id */
	private Long id;

	/** 用户Id */
	private Long user_id;

	/** 题目Id */
	private Long problem_id;

	/** 标题 */
	private String title;

	/** 语法 {@link com.gzu.taurus.goj.common.enums.Submit.Language} */
	private Integer syntax;

	/** 主题 {@link com.gzu.taurus.goj.common.enums.Share.Theme} */
	private Integer theme;

	/** 内容 */
	private String content;

	public ShareDO() {
	}

	public ShareDO(Long id) {
		this.id = id;
	}

	/***************************************************************************/
	/*************************** Getter Setter *********************************/
	/***************************************************************************/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSyntax() {
		return syntax;
	}

	public void setSyntax(Integer syntax) {
		this.syntax = syntax;
	}

	public Integer getTheme() {
		return theme;
	}

	public void setTheme(Integer theme) {
		this.theme = theme;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
