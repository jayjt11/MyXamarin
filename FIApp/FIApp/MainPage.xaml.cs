using System;
using Xamarin.Forms;


namespace FIApp
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
          
        }

        public void Button_Clicked(object sender, EventArgs args)
        {
            var callZelle = DependencyService.Get<IZelleService>();
            if (callZelle != null)
            {
               
                callZelle.launchZell(ApplicationName.Text, BaseUrl.Text, InstitutionId.Text, SSOKey.Text, ProductId.Text, null);

            }
        }
    }
}
