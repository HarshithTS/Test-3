/*package CommonLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportVesionThree {
	public static ExtentReports report;
    public static ExtentTest logger;  
       
       static Calendar cal = Calendar.getInstance();
       static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
public static String projectDirectory = System.getProperty("user.dir");
public static String ReportLocation=projectDirectory+"\\FlipkartReports123\\Report\\EMSOPSReport"+ sdf.format(cal.getTime())+".html";
    
public static void intialiseconfig()
{
    report=createInstance(ReportLocation);
}

private static ExtentReports createInstance(String fileName) {
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
    htmlReporter.loadXMLConfig("extent-config.xml");
    report = new ExtentReports();
    report.attachReporter(htmlReporter);
    report.setAnalysisStrategy(AnalysisStrategy.TEST);
    return report;
}
public static String captureScreenShot(WebDriver driver,String screenshotname)
{
    try{
        TakesScreenshot ts=(TakesScreenshot) driver; 
        File src=ts.getScreenshotAs(OutputType.FILE);
        String des=projectDirectory+"\\FlipkartReports\\Report\\Screenshots\\"+screenshotname+".png";
        File destination =new File(des);
        FileUtils.copyFile(src, destination);
        return des;        
    }
    catch(Exception e)
    {
        System.out.println("Exception while taking screen shot"+e.getMessage());
        return e.getMessage();
    }
    
}

public static void PassCase (String ImgDesc,String imagename ) throws Exception
{
    String screenshot_path=ReportVesionThree.captureScreenShot(DriverConfiguration.driver, imagename);
    MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
    logger.pass(ImgDesc, mediaModel);
}

public static void FailCase (String failedDetail,String imagename ) throws Exception
{
    String screenshot_path=ReportVesionThree.captureScreenShot(DriverConfiguration.driver, imagename);
    MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
    logger.fail(failedDetail, mediaModel);
}
}

}
*/