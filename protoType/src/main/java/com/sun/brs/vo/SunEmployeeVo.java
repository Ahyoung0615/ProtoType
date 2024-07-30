package com.sun.brs.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SunEmployeeVo {

	private String empno;
	private String name;
	private String jobtitle;
	private String hiredate;
	private String phonenumber;
	private String email;
	private String sal;
	private String deptno;
}
