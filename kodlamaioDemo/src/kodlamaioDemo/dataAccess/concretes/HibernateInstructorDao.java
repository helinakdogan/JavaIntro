package kodlamaioDemo.dataAccess.concretes;

import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile eklendi : " + instructor.getInstructorName());
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor get(int instructorId) {
		// TODO Auto-generated method stub
		return null;
	}



}
