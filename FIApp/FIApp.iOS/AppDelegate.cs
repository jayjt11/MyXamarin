
using System.Collections;
using FIApp.iOS;
using Foundation;
using UIKit;
using Xamarin.Forms;
using Binding;
using MessageUI;

[assembly: Dependency(typeof(AppDelegate))]
namespace FIApp.iOS
{
    // The UIApplicationDelegate for the application. This class is responsible for launching the 
    // User Interface of the application, as well as listening (and optionally responding) to 
    // application events from iOS.
    [Register("AppDelegate")]
    public partial class AppDelegate : global::Xamarin.Forms.Platform.iOS.FormsApplicationDelegate, IZelleService
    {
     
        //
        // This method is invoked when the application has loaded and is ready to run. In this 
        // method you should instantiate the window, load the UI into it and then make the window
        // visible.
        //
        // You have 17 seconds to return from this method, or iOS will terminate your application.
        //

        public override bool FinishedLaunching(UIApplication app, NSDictionary options)
        {
            global::Xamarin.Forms.Forms.Init();
            LoadApplication(new App());
            return base.FinishedLaunching(app, options);


        }

        public void launchZell(string applicationName, string baseUrl, string institutionId, string ssoKey, string product, IDictionary data)
        {
            

            var controller = new SampleViewController(applicationName, baseUrl, institutionId, ssoKey, product);
            UIApplication.SharedApplication.KeyWindow.RootViewController.PresentViewController(controller, true, null);


        }

    }
}
