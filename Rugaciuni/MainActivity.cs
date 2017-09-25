using Android.App;
using Android.Widget;
using Android.OS;
using System;
using Android.Content;

namespace Rugaciuni
{
    [Activity(Label = "Rugaciuni", MainLauncher = true)]
    public class MainActivity : Activity
    {
        private Button orderButton;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            FindViews();
            HandleEvents();
        }

        private void FindViews()
        {
            orderButton = FindViewById<Button>(Resource.Id.rugaciuniDimineataBtn);
        }

            private void HandleEvents()
        {
            orderButton.Click += OrderButton_Click;
        }

        private void OrderButton_Click(object sender, EventArgs e)
        {
            var intent = new Intent(this, typeof(ReadModeActivity));
            StartActivity(intent);
        }
    }
}

