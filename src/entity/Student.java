package entity;

public class Student {
	// required parameters
	private String id;
	private String name;
	private String classname;
	private int age;
	private String gender;
	// optional parameters
	private String address;
	private String fathername;
	private String mothername;
	private String nationality;
	private String religion;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getClassname() {
		return classname;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getFathername() {
		return fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public String getNationality() {
		return nationality;
	}
	public String getReligion() {
		return religion;
	}
	
	
	public Student(StudentBuilder studentBuilder) {
		this.id = studentBuilder.id;
		this.name = studentBuilder.name;
		this.classname = studentBuilder.classname;
		this.age = studentBuilder.age;
		this.gender = studentBuilder.gender;
		this.address = studentBuilder.address;
		this.fathername = studentBuilder.fathername;
		this.mothername = studentBuilder.mothername;
		this.nationality = studentBuilder.nationality;
		this.religion = studentBuilder.religion;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classname=" + classname + ", age=" + age + ", gender="
				+ gender + ", address=" + address + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", nationality=" + nationality + ", religion=" + religion + "]";
	}


	public static class StudentBuilder{
		// required parameters
		private String id;
		private String name;
		private String classname;
		private int age;
		private String gender;
		// optional parameters
		private String address;
		private String fathername;
		private String mothername;
		private String nationality;
		private String religion;
		
		public StudentBuilder(String id, String name, String classname, int age, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.classname = classname;
			this.age = age;
			this.gender = gender;
		}

		public StudentBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder setFathername(String fathername) {
			this.fathername = fathername;
			return this;
		}

		public StudentBuilder setMothername(String mothername) {
			this.mothername = mothername;
			return this;
		}

		public StudentBuilder setNationality(String nationality) {
			this.nationality = nationality;
			return this;
		}

		public StudentBuilder setReligion(String religion) {
			this.religion = religion;
			return this;
		}

		public Student Build() {
			return new Student(this);
		}
		
		
	}
	
}
