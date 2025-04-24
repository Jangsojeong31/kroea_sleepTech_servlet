package com.study.koreasleeptechservlet.servlet;

/*
    1. 서블릿
    : 자바로 만들어진 웹 프로그래밍 도구
    - 동적 웹 페이지를 만들 때 사용되는 자바 기반의 웹 애플리케이션 프로그래밍 기술
    - 웹 요청과 응답의 흐름을 메서드 호출만으로 체계적인 설계를 다룸

    2. 서블릿 컨테이너
    : 구현되어 있는 Servlet 클래스의 규칙에 맞게 서블릿을 담고 관리해주는 컨테이너
    - 클라이언트에서 요청을 하면 컨테이너는 HttpServletRequest, HttpServletResponse 두 객체를 생성
        + post, get 여부에 따라 동적인 페이지를 생성하여 응답을 전송

    3. 서블릿 전체 동작 흐름
    1) 웹 브라우저에 요청
    2) 톰캣(WAS)이 요청 받음
    3) 톰캣이 서블릿 컨테이너에 전달: web.xml 또는 @WebServlet을 보고 해당하는 서블릿 확인
    4) 서블릿 컨테이너가 서블릿을 호출: init() >> doGet() || doPost()
    5) 동적 페이지 생성
    6) 응답 전달


 */
public class UserServlet {
}
