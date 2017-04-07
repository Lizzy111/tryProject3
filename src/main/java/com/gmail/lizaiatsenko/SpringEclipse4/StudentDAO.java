package com.gmail.lizaiatsenko.SpringEclipse4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAO {

	SessionFactory sessionFact;

	public SessionFactory getSessionFact() {
		return sessionFact;
	}

	public void setSessionFact(SessionFactory sessionFact) {
		this.sessionFact = sessionFact;
	}

	public void saveStudent(Student student) {

		Session session = sessionFact.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(student);
		transaction.commit();
		session.close();
	}
}
