package humans;

public class ClassBasic {

	public static void main(String[] args) {
		Teacher ivanov = new Teacher("Petar","Ivanov",25,3,"chemistry");
		ivanov.sayGoodDay();
		ivanov.saySubject();
		ivanov.checkingHomeworks();
		ivanov.sayGoodbye();
		System.out.println();
		
		Teacher lipova = new Teacher("Lilqna","Lipowa",20,5,"geography");
		ivanov.sayGoodDay();
		lipova.saySubject();
		ivanov.checkingHomeworks();
		ivanov.sayGoodbye();
		System.out.println();
		
		Lecturer petrov = new Lecturer("Georgi","Petrov",35,10,"UNWE");
		petrov.sayGoodDay();
		petrov.sayUniversity();
		petrov.conductingExercises(15);
		petrov.conductingExercises(60);
		petrov.sayMaxLectures();
		petrov.conductingExercises("math");
		petrov.checkingHomeworks();
		System.out.println();
		
		String [] classes = {"3A","5B","7C","4A","7A"};
		SchoolTeacher georgieva = new SchoolTeacher("Ivanka","Georgieva",50,25,"biology",classes);
		georgieva.sayGoodDay();
		georgieva.saySubject();
		georgieva.sayClasses(classes);
		georgieva.amuseKids();
		georgieva.checkingHomeworks();
		georgieva.sayGoodbye();
		System.out.println();
		
		CollegeTeacher angelova = new CollegeTeacher("Mariana","Angelova",22,1,"IT","Marketing college");
		angelova.sayGoodDay();
		angelova.saySubject();
		angelova.checkingHomeworks();
		angelova.sayGoodbye();
		System.out.println();
		
		Professor milev = new Professor("Nikolay","Milev",45,10,"Sofia University","professor");
		milev.sayGoodDay();
		milev.sayTitle();
		milev.sayUniversity();
		milev.conductingExercises(10.5);
		milev.conductingExercises(42);
		milev.conductingExercises("sport");
		milev.conductExams();
		milev.checkingHomeworksSecondWay();
		System.out.println();
		
		CollegeTeacher borislavov = new CollegeTeacher("Bojidar","Borislavov",35,7,"KSI","IT College");
		borislavov.sayGoodDay();
		borislavov.checkingHomeworks();
		borislavov.saySubject();
		borislavov.sayGoodbye();
		System.out.println();
		
		Assistant toshev = new Assistant("Milko","Toshev",70,45,"Technical University",true);
		toshev.sayGoodDay();
		toshev.presenting();
		toshev.sayUniversity();
		toshev.conductingExercises(15);
		toshev.conductingExercises(60);
		toshev.conductingExercises("electronic");
		toshev.writeScientificArticles();
		toshev.checkingHomeworksSecondWay();
		toshev.checkingExams();
		
		Assistant grigorova = new Assistant("Milko","Toshev",50,15,"Technical University",false);
		grigorova.sayGoodDay();
		grigorova.presenting();
		grigorova.sayUniversity();
		grigorova.conductingExercises(5);
		grigorova.conductingExercises(20);
		grigorova.conductingExercises("microelectronics");
		grigorova.writeScientificArticles();
		grigorova.checkingHomeworksSecondWay();
		grigorova.checkingExams();
		
		Professor zdravkova = new Professor("Jeni","Zdravkova",50,20,"Sofia University","docent");
		milev.sayGoodDay();
		milev.sayTitle();
		milev.sayUniversity();
		milev.conductingExercises(10);
		milev.conductingExercises(40);
		milev.conductingExercises("biology");
		milev.conductExams();
		milev.checkingHomeworksSecondWay();
		System.out.println();
		
		System.out.printf("You have %d persons created.",Person.counter);
	}
}
