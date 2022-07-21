using Android.App;
using Android.OS;
using AndroidX.AppCompat.App;
using Com.Fiserv.Dps.Mobile.Sdk.Bridge.Zelleview;
using Com.Fiserv.Dps.Mobile.Sdk.Bridge.Model;
using Com.Fiserv.Dps.Mobile.Sdk.Interfaces;
using Xamarin.Forms;
using Android.Widget;
using System.Collections;
using System;

namespace FIApp.Droid
{
    [Activity(Label = "ZelleActivity", Theme = "@style/MainTheme", MainLauncher = true)]
    public class ZelleActivity:AppCompatActivity, IGenericTag
    {
        public void SessionTag(string tag)
        {
           // Toast.MakeText(Forms.Context, tag, ToastLength.Long).Show();
            Console.WriteLine(tag);
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.zelle_activity);

            BridgeView.GenericTag = this;

            //getting data from MainActivity
            string applicationName = Intent.GetStringExtra("applicationName") ?? "Data not available";
            string baseUrl = Intent.GetStringExtra("baseUrl") ?? "Data not available";
            string institutionId = Intent.GetStringExtra("institutionId") ?? "Data not available";
            string ssoKey = Intent.GetStringExtra("ssoKey") ?? "Data not available";
            string product = Intent.GetStringExtra("product") ?? "Data not available";

            Zelle zelle = new Zelle(
               applicationName,
               baseUrl,
               institutionId,
               ssoKey,
               product,
               null
       );
           
            Bridge bridge = new Bridge(this, zelle);
            zelle.PreCacheContacts = true;
            BridgePopup bridgeView = bridge.Popup();

            //To show the zelle view in popup
           // bridgeView.Show(SupportFragmentManager, bridgeView.Tag);


            //To show Zelle view
            SupportFragmentManager // Get the support fragment manager instead of the FragmentManager
            .BeginTransaction() // Start a transaction
             .Replace(Resource.Id.lay_view, bridgeView) // Add the fragment
            .Commit(); // Commit the changes
        }

    }
}
