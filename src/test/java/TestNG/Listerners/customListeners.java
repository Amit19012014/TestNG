package TestNG.Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListeners implements ITestListener {


    //This belongs to ITestListeners and will execute before starting of Test set/batch

public void onStart(ITestContext arg){
    System.out.println("Start the execution_______"+arg.getName());
}
    //This belongs to ITestListeners and will execute after starting of Test set/batch

    public void onFinish(ITestContext arg){
        System.out.println("Start the execution_______"+arg.getName());
    }

    public void onTestStart(ITestResult arg0){
        System.out.println("Start the execution_______"+arg0.getName());
    }


    public void onTestSkipped(ITestResult arg0){
        System.out.println("Start the execution_______"+arg0.getName());
    }

    public void onTestSuccess(ITestResult arg0){
        System.out.println("Start the execution_______"+arg0.getName());
    }


    public void onTestFailure(ITestResult arg0){
        System.out.println("Start the execution_______"+arg0.getName());
    }

}






