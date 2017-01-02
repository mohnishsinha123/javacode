

	//* in this Example we are going to compare the Details of Student
	//in sorted manner by Age.


	class Student implements Comparable<Student>// using Comparable Interface 
	{
		int rollno;
		String name;
		int age;
		
		Student(int rn,String nm, int ag)
		{
			this.rollno= rn;
			this.name = nm;
			this.age = ag;
		}
		public int compareTo(Student st)// while using Comparable Interface compareTo Method is Compulsory
		{
			if(age==st.age)
				return 0;
			else if (age>st.age)
				return 1;
			else
				return -1;
		}
	}


