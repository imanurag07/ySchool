package org.yarlithub.yschool.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschool.Subject;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschool.SubjectDao;
 
 
/**
 * DAO for table: Subject.
 * @author autogenerated
 */
@Repository
public class SubjectDaoImpl extends GenericHibernateDaoImpl<Subject, Integer> implements SubjectDao {
	
	/** Constructor method. */
		public SubjectDaoImpl() {
			super(Subject.class);
		}
	}
