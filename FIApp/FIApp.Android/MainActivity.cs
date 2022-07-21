using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.OS;
using Android.Content;
using FIApp.Droid;
using Xamarin.Forms;
using System.Collections;

[assembly: Dependency(typeof(MainActivity))]
namespace FIApp.Droid
{
    [Activity(Label = "FIApp", Icon = "@mipmap/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity, IZelleService
    {
        public static Xamarin.Forms.Platform.Android.FormsAppCompatActivity Instance { get; private set; }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
            LoadApplication(new App());
            Instance = this;

        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }

        public void launchZell(string applicationName, string baseUrl, string institutionId, string ssoKey, string product, IDictionary parameters)
        {
            //Intent intent = new Intent(Forms.Context, typeof(ZelleActivity));
            //Forms.Context.StartActivity(intent);

            Intent intent = new Intent(MainActivity.Instance, typeof(ZelleActivity));
            intent.PutExtra("applicationName", applicationName);
            intent.PutExtra("baseUrl", baseUrl);
            intent.PutExtra("institutionId", institutionId);
            intent.PutExtra("ssoKey", ssoKey);
            intent.PutExtra("product", product);
            MainActivity.Instance.StartActivity(intent);
        }
    }
}


