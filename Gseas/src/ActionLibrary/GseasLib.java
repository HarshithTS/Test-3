package ActionLibrary;



import org.openqa.selenium.support.PageFactory;

import CommonLibrary.DriverConfig;
import CommonLibrary.Reports;
import Elementrepository.Gseas;

public class GseasLib {
	Gseas g = PageFactory.initElements(DriverConfig.driver, Gseas.class);
	
	
	public void Userid(String Userid){
		try{
		g.getUserid().sendKeys(Userid);
		Reports.PassCase("Printing userid", "userid");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Password(String Password){
		try{
		g.getPassword().sendKeys(Password);
		Reports.PassCase("Entering password", "password");
		}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void submit(){
		try{
		g.getSubmit().click();
		Reports.PassCase("Submitting", "Submit");
		}
		catch(Exception e){
			System.out.println("error occured");
		}
		
	}}  //888888888
	/*public void TakeAttendance(){
		g.getTakeAttendance().click();
	}
	public void Attdate(){
		g.getAttdate().click();
	}
	public void Seldate(){
		g.getSeldate().click();
	}
	
	public void choosecoursetab(){
		g.getChoosecoursetab().click();
	}
	public void selcourse(){
		g.getSelcourse().click();
	}
	public void chooseBatchTab(){
		g.getChooseBatchTab().click();
	}
    public void selbatch(){
    	g.getSelbatch().click();
    }
    public void choosesession(){
    	g.getChoosesession().click();
    }
    public void createnew(){
    	g.getCreatenew().click();
    }
    public void starttime(String starttime){
    	g.getStarttime().sendKeys(starttime);
    }
    public void endtime(String endtime){
    	g.getEndtime().sendKeys(endtime);
    }
    public void nav(){
    	g.getNav().click();
    }
    public void pri(){
    	g.getPri().click();
    }
    public void Sub(){
    	g.getSubmit2().click();
    }
    
    public void home(){
    	g.getHome().click();
    }*/
    
   /* public void Mylib(){                       888888888
    	g.getMylib().click();
    }
    
   /* public void Filter(String Filter){
    	g.getFilter().sendKeys(Filter);
    }
    
    public void mark(){
    	g.getMark().click();
    }
    
    public void Filterr(){
    	g.getFilterr().click();
    }
    public void Course(){
    	g.getTestCourse().click();
    }
   
    public void manage(){
    	g.getManagecurriculum().click();
    }
   
    public void AddModule(String Module){
    	g.getAddModule().sendKeys(Module);
         
    }
    public void AddTopic(String Topic){
    	g.getAddtopic().sendKeys(Topic);
    }
    */
    
  /*public void Addnewcoursetab(){                          8888888888
	  g.getAddnewcoursetab().click();  
  }
    public void Dropdowntocreatesub(){
    	g.getDropdowntocreatesub().click();
    }
   
    public void CourseNamejs(){
    	g.getCourseNamejs().click();
    }
    
    public void Title(String Title){
    	g.getTitle().sendKeys("JAVA SELENIUM");
    }
    public void Radio1(){
    	g.getRadio1().click();
    }
    public void Publish(){
    	g.getPublish().click();
    }
    public void Subcourse(){
    	g.getSubcourse().click();
    }
}
*/                                            /* 888888888888888888*/