package pack3;

import java.util.Comparator;

public class Student implements Comparable<Student>,Comparator<Student> {
	private int id;
	private String name;
	private Integer age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public int compareTo(Student ob) {
		return name.compareTo(ob.getName());
	}
        @Override
        public boolean equals(final Object obj) {
          if (obj == null) {
             return false;
          }
          final Student std = (Student) obj;
          if (this == std) {
             return true;
          } else {
             return (this.name.equals(std.name) && (this.age == std.age));
          }
        }
        @Override
        public int hashCode() {
          int hashno = 7;
          hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
          return hashno;
        }
		@Override
		public int compare(Student s1, Student s2) {
			//return ((s1.age == s2.age)? 0 : (s1.age > s2.age)? -1 : 1);
			return s1.age.compareTo(s2.age);
		}	
}
