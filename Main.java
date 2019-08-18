import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<ScientificStudent> scienceStudentList = new ArrayList<>();
		ArrayList<SocialStudent> socialStudentList = new ArrayList<>();
		ArrayList<Class> classList = new ArrayList<>();
		Math m = new Math(12, "asjas", "Matematika");
		Economic e = new Economic(1, "asjas", "Ekonomi");

		int input;
		try {
			for (int i = 0;; i++) {
				System.out.println("1. Masukkan Guru");
				System.out.println("2. Masukkan Murid");
				System.out.println("3. Masukkan Kelas");
				System.out.println("4. read student");
				System.out.println("5. read teacher");
				System.out.println("6. read class");
				System.out.println("7. add teacher and student to class");
				System.out.println("8. set exam");
				System.out.println("9. set exercise");
				System.out.println("10. set interview");
				System.out.println("11. set presentation");
				System.out.println("99. Exit");
				input = sc.nextInt();
				sc.nextLine();

				switch (input) {
				case 1:
					System.out.print("Masukkan nama Guru : ");
					String name = sc.nextLine();
					System.out.print("Masukkan NIK : ");
					String id = sc.next();
					Teacher t = new Teacher(name, id);
					teacherList.add(t);
					break;
				case 2:
					boolean emptyClass = false;
					boolean emptyTeacher = false;
					if (classList.size() == 0) {
						emptyClass = true;
					}
					if (teacherList.size() == 0) {
						emptyTeacher = true;
					}

					if (!emptyClass && !emptyTeacher) {
						System.out.print("Masukkan nama siswa : ");
						name = sc.nextLine();
						System.out.print("Masukkan NIS : ");
						id = sc.next();
						System.out.println();
						System.out.println("Pilih Gender : ");
						System.out.println("1. Laki-laki");
						System.out.println("2. Perempuan");
						int inGender = sc.nextInt();
						sc.nextLine();
						char gender = '1';
						if (inGender == 1) {
							gender = 'L';
						} else {
							gender = 'P';
						}
						System.out.println("Pilih Jurusan : ");
						System.out.println("1. Scince");
						System.out.println("2. Social");
						int in2 = sc.nextInt();
						sc.nextLine();
						boolean science;
						if (in2 == 1) {
							m.setCourse("Matematika, fisika");
							scienceStudentList.add(new ScientificStudent(name, id, gender, m));

						} else if (in2 == 2) {
							e.setCourse("sosiologi, geografi");
							socialStudentList.add(new SocialStudent(name, id, gender, e));
						}
						System.out.println();
					} else {
						System.out.println("Tambahkan kelas dan guru terlebih dahulu");
					}
					break;
				case 3:
					System.out.print("Masukan kode kelas : ");
					String kode = sc.next();
					System.out.print("Masukkan jenis kelas : ");
					System.out.println("1. science");
					System.out.println("2. social");
					String jenis = sc.next();
					String klas;
					if (jenis.equalsIgnoreCase("1")) {
						klas = "science";
					} else {
						klas = "social";
					}
					classList.add(new Class(kode, klas));
					break;
				case 4:
					System.out.println("SCIENCE");
					for (int j = 0; j < scienceStudentList.size(); j++) {
						System.out.println(scienceStudentList.get(j).getName());
						System.out.println(scienceStudentList.get(j).getIdentityNumber());
						System.out.println(scienceStudentList.get(j).getGender());
					}

					System.out.println("SOCIAL");
					for (int j = 0; j < socialStudentList.size(); j++) {
						System.out.println(socialStudentList.get(j).getName());
						System.out.println(socialStudentList.get(j).getIdentityNumber());
						System.out.println(socialStudentList.get(j).getGender());
					}
					break;
				case 5:
					for (int x = 0; x < teacherList.size(); x++) {
						System.out.println("NIK : " + teacherList.get(x).getId());
						System.out.println("Nama Guru : " + teacherList.get(x).getName());
					}
					break;
				case 6:
					for (int j = 0; j < classList.size(); j++) {
						System.out.println("Kelas : " + classList.get(j).getClassName());
						System.out.println("Jenis kelas : " + classList.get(j).getClassCourse());
						if (classList.get(j).getClassCourse().equalsIgnoreCase("science")) {
							System.out.println("Jurusan : " + scienceStudentList.get(0).getMath().getCourseName());
							System.out.println("Mata Pelajaran : " + m.getCourse());
						} else {
							System.out.println("Jurusan : " + socialStudentList.get(0).getCourseName());
							System.out.println("Mata Pelajaran : " + e.getCourse());
						}
						if (classList.get(j).getTeacher() != null) {
							System.out.println("Pengajar : " + classList.get(j).getTeacher().getName());
							for (int k = 0; k < classList.get(j).getStudentCount(); k++) {
								System.out.println("Nama siswa : " + classList.get(j).getStudent().get(k).getName());
								System.out.println("NIS : " + classList.get(j).getStudent().get(k).getIdentityNumber());
								classList.get(j).getStudent().get(k).exam();
								classList.get(j).getStudent().get(k).presentation();
								classList.get(j).getStudent().get(k).interview();
								;
								classList.get(j).getStudent().get(k).exercise();
							}
						}
					}
					break;

				case 7:
					System.out.print("Pilih class : ");
					for (int j = 0; j < classList.size(); j++) {
						System.out.println(j + ". " + classList.get(j).getClassName());
					}
					int chooseClass = sc.nextInt();
					String classcourse = classList.get(chooseClass).getClassCourse();

					System.out.println("Pilih Guru yang ingin dimasukkan : ");
					for (int j = 0; j < teacherList.size(); j++) {
						System.out.println(j + ". " + teacherList.get(j).getName());
					}
					int chooseTeacher = sc.nextInt();

					System.out.println("Pilih Siswa yang ingin ditambahkan  : ");
					if (classcourse.equalsIgnoreCase("science")) {
						for (int j = 0; j < scienceStudentList.size(); j++) {
							System.out.println(j + ". " + scienceStudentList.get(j).getName());
						}
						classList.get(chooseClass).setTeacher(teacherList.get(chooseTeacher));
						classList.get(chooseClass).setStudent(scienceStudentList.get(sc.nextInt()));
					} else {
						for (int j = 0; j < socialStudentList.size(); j++) {
							System.out.println(j + ". " + socialStudentList.get(j).getName());
						}
						classList.get(chooseClass).setTeacher(teacherList.get(chooseTeacher));
						classList.get(chooseClass).setStudent(scienceStudentList.get(sc.nextInt()));
					}
					sc.nextLine();
					break;
				case 8:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setExam(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setExam(true);
					}
					break;
				case 9:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setExercise(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setExercise(true);
						;
					}
					break;
				case 10:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setPresentation(true);
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setPresentation(true);
						;
					}
					break;
				case 11:
					for (int j = 0; j < scienceStudentList.size(); j++) {
						scienceStudentList.get(j).setInterview(true);
						;
					}
					for (int j = 0; j < socialStudentList.size(); j++) {
						socialStudentList.get(j).setInterview(true);
					}
					break;
				case 99:
					System.exit(1);
					break;
				default:
					break;
				}

			}
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("Masukan salah");
		}
	}

}
