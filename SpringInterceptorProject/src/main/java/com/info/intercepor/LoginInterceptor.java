package com.info.intercepor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		req.setAttribute("startTime", startTime);
		String str = req.getRequestURI();
		System.out.println(str);
		if (!req.getRequestURI().contains("/") && !req.getRequestURI().contains("/send")
				&& !req.getRequestURI().contains("/save")) {
			String userData = (String) req.getSession().getAttribute("user");
			System.out.println(userData);
			if (userData == null) {
				//HttpSession ss = req.getSession();
				System.out.println("yes");
				req.setAttribute("msg", "Please Enter login Details");
				res.sendRedirect("/SpringFramework/send");
				System.out.println("No");
				return false;
			}
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	}
	/*
	 * public boolean preHandel(HttpServletRequest req, HttpServletResponse res,
	 * Object obj) throws IOException { long startTime =
	 * System.currentTimeMillis(); req.setAttribute("startTime", startTime);
	 * String str = req.getRequestURI(); System.out.println(str); if
	 * (!req.getRequestURI().equals("/SpringInterceptorProject/send") &&
	 * !req.getRequestURI().equals("/SpringInterceptorProject/save")) { Login
	 * userData = (Login) req.getSession().getAttribute("user"); if (userData ==
	 * null) {
	 * 
	 * res.sendRedirect("/SpringInterceptorProject/send"); return false; } }
	 * 
	 * if(str.equals("/SpringInterceptorProject/save")) {
	 * 
	 * } return true; }
	 */

	/*
	 * public void postHandle(HttpServletRequest request, HttpServletResponse
	 * response, Object handler, ModelAndView modelAndView) throws Exception {
	 * long startTime = (Long) request.getAttribute("startTime");
	 * request.removeAttribute("startTime");
	 * 
	 * long endTime = System.currentTimeMillis();
	 * modelAndView.addObject("totalTime", endTime - startTime);
	 * 
	 * System.out.println("Request Prcessing Time :: " + (endTime - startTime));
	 * }
	 */

	/*
	 * public void afterCompletion(HttpServletRequest request,
	 * HttpServletResponse response, Object handler, Exception exceptionIfAny)
	 * throws Exception { System.out.println("View Rendered !!"); }
	 */
}
