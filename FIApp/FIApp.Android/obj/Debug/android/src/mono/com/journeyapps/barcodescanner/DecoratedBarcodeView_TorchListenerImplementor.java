package mono.com.journeyapps.barcodescanner;


public class DecoratedBarcodeView_TorchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.journeyapps.barcodescanner.DecoratedBarcodeView.TorchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTorchOff:()V:GetOnTorchOffHandler:Com.Journeyapps.Barcodescanner.DecoratedBarcodeView/ITorchListenerInvoker, ZxingEmbedded\n" +
			"n_onTorchOn:()V:GetOnTorchOnHandler:Com.Journeyapps.Barcodescanner.DecoratedBarcodeView/ITorchListenerInvoker, ZxingEmbedded\n" +
			"";
		mono.android.Runtime.register ("Com.Journeyapps.Barcodescanner.DecoratedBarcodeView+ITorchListenerImplementor, ZxingEmbedded", DecoratedBarcodeView_TorchListenerImplementor.class, __md_methods);
	}


	public DecoratedBarcodeView_TorchListenerImplementor ()
	{
		super ();
		if (getClass () == DecoratedBarcodeView_TorchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Journeyapps.Barcodescanner.DecoratedBarcodeView+ITorchListenerImplementor, ZxingEmbedded", "", this, new java.lang.Object[] {  });
	}


	public void onTorchOff ()
	{
		n_onTorchOff ();
	}

	private native void n_onTorchOff ();


	public void onTorchOn ()
	{
		n_onTorchOn ();
	}

	private native void n_onTorchOn ();

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
