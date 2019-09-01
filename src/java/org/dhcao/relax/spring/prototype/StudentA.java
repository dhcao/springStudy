package org.dhcao.relax.spring.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: dhcao
 * @Version: 1.0
 */
@Component
@Scope("prototype")
public class StudentA {

	@Autowired
	private TeacherA teacher;

	public TeacherA getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherA teacher) {
		this.teacher = teacher;
	}
}
