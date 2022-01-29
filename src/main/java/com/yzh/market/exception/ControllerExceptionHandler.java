package com.yzh.market.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yzh.market.common.CommonResp;

@ControllerAdvice
public class ControllerExceptionHandler {
	 private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	    /**
	     * 校验异常统一处理
	     * @param e
	     * @return
	     */
	    @ResponseBody
	    @ExceptionHandler(value = BindException.class)
	    public CommonResp validExceptionHandler(BindException e) {
	        CommonResp commonResp = new CommonResp();
	        commonResp.setSuccess(false);
	        commonResp.setMessage(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
	        return commonResp;
	    }

	   
		@ResponseBody
		@ExceptionHandler(value = BusinessException.class)
		public CommonResp validExceptionHandler(BusinessException e) {
		    CommonResp commonResp = new CommonResp();
		    LOG.warn("业务异常：{}", e.getCode().getDesc());
		    commonResp.setSuccess(false);
		    commonResp.setMessage(e.getCode().getDesc());
		    return commonResp;
		} 
	 
		@ResponseBody
		@ExceptionHandler(value = Exception.class)
		public CommonResp validExceptionHandler(Exception e) {
		    CommonResp commonResp = new CommonResp();
		    commonResp.setSuccess(false); 
		    commonResp.setMessage("系统出现异常，请联系管理员");
		    return commonResp;
		}
}
