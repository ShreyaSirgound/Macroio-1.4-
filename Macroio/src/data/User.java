package data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
    /** 
     * The user's name
     */
    private static String name;

    /**
     * The user's age
     */
    private static double age;

    /**
     * The user's weight(kg)
     */
    private static double weight;
    /**
     * The user's height(cm)
     */
	private static double height;

    /**
     * The user's sex
     */
    private static String sex;

    /**
     * The user's dietary preferences (list of all selected)
     */
    private static Set<String> diet;

    /**
     * The user's general activity level
     */
    private static String activity;

    /**
     * The user's activity level number
     */
    private static double activityNum;

    /**
     * The user's password
     */
	
	private static String password;

    /**
     * The user's calculated BMR value
     */
    private static double bmr;

     /**
      * Creates a new user object
      */
    public User(String name, double age, double height, double weight, String sex, Set<String> diet, String activity, String password, double bmr){
        User.name = name;
        User.age = age;
        User.height = height;
        User.weight = weight;
        User.sex = sex;
        User.diet = diet;
        User.activity = activity;
        User.password = password;
        User.bmr = bmr;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        User.name = name;
    }

    public double getAge() {
    	return age;
    }
    
    public void setAge(double age) {
    	User.age = age;
    }
    
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        User.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        User.weight = weight;
    }

    public String getSex() {
    	return sex;
    }
    
    public void setSex(String sex) {
    	User.sex = sex;
    }

    public Set<String> getDiet() {
    	return diet;
    }
    
    public void setDiet(Set<String> diet) {
    	User.diet = diet;
    }

    public String getActivity() {
    	return activity;
    }
    
    public void setActivity(String activity) {
    	User.activity = activity;
    }

    public static double getActivityNum() {
    	return activityNum;
    }
    
    public static void setActivityNum(double activityNum) {
    	User.activityNum = activityNum;
    }

    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
    	User.password = password;
    }

    //The following BMR calculations are calculated using the Harris-Benedict equation
    
    public static double calcMaleBMR(double weight, double height, double age) {
        bmr = 66.5 + (13.75*weight) + (5.003*height) - (6.75*age);
        return bmr;
    }

    public static double calcFemBMR(double weight, double height, double age) {
        bmr = 655.1 + (9.563*weight) + (1.850*height) - (4.676*age);
        return bmr;
    }

    public static double getBMR() {
    	return bmr;
    }
    
    public void setBMR(double bmr) {
    	User.bmr = bmr;
    }

    public static String userToString(User user) {
        String curUser = name + " | " 
                        + age + " | " 
                        + height + " | " 
                        + weight + " | " 
                        + sex + " | " 
                        + diet + " | " 
                        + activity + " | " 
                        + activityNum + " | "
                        + password + " | "
                        + bmr;
        return curUser;
    }

    //creates a list of all the users
    protected static List<User> userList = new ArrayList<User>();

    //add a user to the users list
    public static void addUser(User user) {
        userList.add(user);
    }

    /**
     * Unregisters an existing student account. Does nothing if the account does not exist.
     *
     * @param user The user account to remove
     */
    public static void removeUser(User user) {
        userList.remove(user);
    }
    
    /**
     * Gets a list of all active user accounts.
     *
     * @return A list of users
     */
    public static List<User> getUsers() {
        return userList;
    }
}
