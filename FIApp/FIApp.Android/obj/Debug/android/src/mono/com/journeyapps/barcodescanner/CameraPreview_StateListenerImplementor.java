package mono.com.journeyapps.barcodescanner;


public class CameraPreview_StateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.journeyapps.barcodescanner.CameraPreview.StateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_cameraClosed:()V:GetCameraClosedHandler:Com.Journeyapps.Barcodescanner.CameraPreview/IStateListenerInvoker, ZxingEmbedded\n" +
			"n_cameraError:(Ljava/lang/Exception;)V:GetCameraError_Ljava_lang_Exception_Handler:Com.Journeyapps.Barcodescanner.CameraPreview/IStateListenerInvoker, ZxingEmbedded\n" +
			"n_previewSized:()V:GetPreviewSizedHandler:Com.Journeyapps.Barcodescanner.CameraPreview/IStateListenerInvoker, ZxingEmbedded\n" +
			"n_previewStarted:()V:GetPreviewStartedHandler:Com.Journeyapps.Barcodescanner.CameraPreview/IStateListenerInvoker, ZxingEmbedded\n" +
			"n_previewStopped:()V:GetPreviewStoppedHandler:Com.Journeyapps.Barcodescanner.CameraPreview/IStateListenerInvoker, ZxingEmbedded\n" +
			"";
		mono.android.Runtime.register ("Com.Journeyapps.Barcodescanner.CameraPreview+IStateListenerImplementor, ZxingEmbedded", CameraPreview_StateListenerImplementor.class, __md_methods);
	}


	public CameraPreview_StateListenerImplementor ()
	{
		super ();
		if (getClass () == CameraPreview_StateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Journeyapps.Barcodescanner.CameraPreview+IStateListenerImplementor, ZxingEmbedded", "", this, new java.lang.Object[] {  });
	}


	public void cameraClosed ()
	{
		n_cameraClosed ();
	}

	private native void n_cameraClosed ();


	public void cameraError (java.lang.Exception p0)
	{
		n_cameraError (p0);
	}

	private native void n_cameraError (java.lang.Exception p0);


	public void previewSized ()
	{
		n_previewSized ();
	}

	private native void n_previewSized ();


	public void previewStarted ()
	{
		n_previewStarted ();
	}

	private native void n_previewStarted ();


	public void previewStopped ()
	{
		n_previewStopped ();
	}

	private native void n_previewStopped ();

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
