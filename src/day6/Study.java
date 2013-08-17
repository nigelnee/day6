package day6;

/**
 * 学员类，演示方法的重载
 */
public class Study {
	// 学习某一门课程
	public void studyClass(String className) {
		System.out.println("正在学习" + className);
	}

	public void studyClass(String className, int time) {
		if (time == 1)
			System.out.println("现在是暑假");

		if (time == 2)
			System.out.println("现在是上学期");

	}
}