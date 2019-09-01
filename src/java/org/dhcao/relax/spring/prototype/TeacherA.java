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
public class TeacherA {

	@Autowired
	private StudentA student;

	public StudentA getStudent() {
		return student;
	}

	public void setStudent(StudentA student) {
		this.student = student;
	}
}
