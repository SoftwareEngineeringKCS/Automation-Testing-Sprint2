package Utils;

public class Variables {
	
	//Check-In page Elements
	public static final String LOCATION = "location";
	public static final String CONSULTANT = "consultant";
	public static final String WALK_IN_RB_XPATH = "//input[@value='Walk-In']";
	public static final String CAREER_SERVICE_LOCATION = "Career Services L145";
	public static final String CHECK_IN_TAB_XPATH = "html/body/div[2]/ul/li[4]/a";//change it to customized xpath later
	public static final String CONSULTANT_1 = "Rosales-Ahn, Blanca";
	public static final String REASON = "reason";
	public static final String WALK_IN_TAB_STUDENT_ID_XPATH = "//input[@name=\"student_id2\"]";
	public static final String STUDENT_ID_1 = "12345";
	public static final String FIRST_NAME_XPATH = "//input[@name='first_name']";
	public static final String FIRST_NAME_1 = "Matt";
	public static final String LAST_NAME_XPATH = "//input[@name=\"last_name\"]";
	public static final String LAST_NAME_1 = "Chan";
	public static final String EMAIL_XPATH = "//input[@name=\"email\"]";
	public static final String EMAIL_1 = "rahmanad@kean.edu";
	public static final String SUBMIT_NAME = "submit";
	
	public static final String BY_APPOINTMENT_RB_XPATH = "//input[@value='By-Appointment']";
	public static final String CONFIRMATION_CODE_TB_XPATH = "//input[@name='confirm_num']";
	public static final String CONFIRMATION_CODE_1 = "ABCDE1";
	public static final String BY_APPOINTMENT_TAB_STUDENT_ID_XPATH = "//input[@name=\"student_id1\"]";
	
	public static final String CHECK_IN_RESULT_XPATH = "html/body/div[3]/div[1]/h1";
	public static final String WALK_IN_XPATH = "html/body/div[3]/div[1]/h2[1]";
	public static final String DIV3_P1_XPATH = "html/body/div[3]/div[1]/p[1]";
	public static final String DIV3_P2_XPATH = "html/body/div[3]/div[1]/p[2]";
	public static final String DIV3_P3_XPATH = "html/body/div[3]/div[1]/p[3]";
	public static final String DIV3_P4_XPATH = "html/body/div[3]/div[1]/p[4]";
	public static final String DIV3_P5_XPATH = "html/body/div[3]/div[1]/p[5]";
	public static final String DIV3_P6_XPATH = "html/body/div[3]/div[1]/p[6]";
	public static final String TAKE_SEAT_XPATH = "html/body/div[3]/div[1]/h2[2]";
	public static final String TRY_AGAIN_XPATH = "html/body/div[3]/div[1]/p[5]/a";
	
	public static final String FIELD_CANNOT_BE_EMPTY_XPATH = "html/body/div[3]/div[1]/h2[2]";
	
	
	
	//Check-In page Reasons
	public static final String REASON_OTHER = "Other";
	
	//Appointments Page
	public static final String APPOINTMENTS_TAB_XPATH = "html/body/div[2]/ul/li[3]/a";//change it to customized xpath later
	public static final String AP_STUDENT_ID_XPATH = "//input[@name='student_id']";
	public static final String CELL_PHONE_TB_XPATH = "//input[@name='cell_phone']";
	public static final String CELL_PHONE_1 = "555-444-6666";
	public static final String NEXT_BUTTON_XPATH = "html/body/div[3]/div/form/div[1]/p[9]/button";
	
	//Staff page elements
	public static final String STAFF_TAB_XPATH = "html/body/div[2]/ul/li[2]/a";//change it to customized xpath later
	public static final String USERNAME_TB_XPATH = "//input[@name='login_username']";
	public static final String PASSWORD_TB_XPATH = "//input[@name='login_password']";
	public static final String SIGN_IN_B_XPATH = "html/body/div[3]/form/p[3]/input";//change it to customized xpath later
	public static final String USERNAME_1 = "blanca";
	public static final String PASSWORD_1 = "test";
	
	public static final String SET_AVAILABILITY_RB_XPATH = "//input[@value='Set-Availability']";
	public static final String START_MONTH_NAME = "start_month";
	public static final String START_DAY_NAME   = "start_day";
	public static final String START_YEAR_XPATH = ".//input[@name='start_year']";
	public static final String JANUARY    = "January";
	public static final String END_MONTH_NAME  = "end_month";
	public static final String END_DAY_NAME    = "end_day";
	public static final String YEAR_2018  = "2018";
	public static final String START_TIME_NAME = "start_time";
	public static final String END_TIME_NAME   = "end_time";
	public static final String END_YEAR_XPATH  = ".//input[@name='end_year']";
	
	public static final String MONDAY_CB_XPATH = ".//input[@name='daysMO']";
	public static final String TUESDAY_CB_XPATH = ".//input[@name='daysTU']";
	public static final String WEDNESDAY_CB_XPATH = ".//input[@name='daysWE']";
	public static final String DURATION_NAME = "duration";
	public static final String DAY_8 = "8";
	public static final String DAY_11 = "11";
	public static final String TIME_09 = "09:00";
	public static final String TIME_13 = "13:00";
	public static final String DURATION_60 = "60";
	
	public static final String SET_AVAILABILITY_B_NAME = "btnSetAvailability";
	public static final String SET_AVAILABILITY_BACK_XPATH = "//button[contains(text(), 'BACK')]";
	
	public static final String TABLE_VALIDATION_XPATH = ".//tr[.//td[contains(text(),'01/08/2018')] and .//td[contains(text(),'01/11/2018')] and "
			+ ".//td[contains(text(),'09:00')] and .//td[contains(text(),'13:00')] and .//td[contains(text(),'MO-TU-WE')] and .//td[contains(text(),'60')]]";
}

