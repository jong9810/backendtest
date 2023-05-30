package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/helloboot")
	public ModelAndView helloboot() {
		System.out.println("sts3에서 추가한 문자열입니다.");
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "스프링부트를 시작합니다(깃헙).");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/helloajax")
	public @ResponseBody String helloajax() {
		return "{\"model\":\"스프링부트(ajax)를 시작합니다.\"}";
	}
}

// - git, github(소스 저장소)
// git : 명령어 제공 툴(외부 저장소 제공 x)
// github : 온라인 저장소

// 1) git 명령어 툴 설치
// 2) eclipse, sts3, sts4 안에서 사용하기

// - github 사용법
// 생각날 때마다 백업을 받아두는 게 좋다(자료의 소실을 막기 위해).
// 1) 로그인, repository 생성
// 2) 내 로컬 컴퓨터에 있는 프로젝트 파일을 깃헙 사이트로 전송(push)
// 3) 원격 깃헙 사이트에서 내 로컬 컴퓨터로 전송(pull)
// 4) sts4에서 push/pull을 하려면 인증 수단을 만들어야 한다(github token 생성).
// 5) https://github.com/jong9810/backendtest.git
// 	  복사본 저장소를 내 컴퓨터에 clone
//    window - show view - git - git repository - 2번째(clone)
// 6) 프로젝트 파일 우클릭 - team - share project (프로젝트 공유 시작)
// 7) 프로젝트 파일 우클릭 - team - add to index -commit or commit and push
