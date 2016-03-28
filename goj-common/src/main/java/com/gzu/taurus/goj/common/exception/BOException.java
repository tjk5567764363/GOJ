package com.gzu.taurus.goj.common.exception;

/**
 * 业务异常
 *
 * @Author tangjunkai
 * @CreateDate 2016年3月22日
 */
public class BOException extends Exception {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public BOException() {
		super();
	}

	public BOException(String message) {
		super(message);
	}

	public BOException(Throwable cause) {
		super(cause);
	}

	public BOException(String message, Throwable cause) {
		super(message, cause);
	}
}
