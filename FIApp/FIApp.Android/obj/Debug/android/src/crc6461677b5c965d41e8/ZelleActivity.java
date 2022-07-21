package crc6461677b5c965d41e8;


public class ZelleActivity
	extends androidx.appcompat.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.fiserv.dps.mobile.sdk.interfaces.GenericTag
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_sessionTag:(Ljava/lang/String;)V:GetSessionTag_Ljava_lang_String_Handler:Com.Fiserv.Dps.Mobile.Sdk.Interfaces.IGenericTagInvoker, ZelleSDKAndroidBinding\n" +
			"";
		mono.android.Runtime.register ("FIApp.Droid.ZelleActivity, FIApp.Android", ZelleActivity.class, __md_methods);
	}


	public ZelleActivity ()
	{
		super ();
		if (getClass () == ZelleActivity.class)
			mono.android.TypeManager.Activate ("FIApp.Droid.ZelleActivity, FIApp.Android", "", this, new java.lang.Object[] {  });
	}


	public ZelleActivity (int p0)
	{
		super (p0);
		if (getClass () == ZelleActivity.class)
			mono.android.TypeManager.Activate ("FIApp.Droid.ZelleActivity, FIApp.Android", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void sessionTag (java.lang.String p0)
	{
		n_sessionTag (p0);
	}

	private native void n_sessionTag (java.lang.String p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
