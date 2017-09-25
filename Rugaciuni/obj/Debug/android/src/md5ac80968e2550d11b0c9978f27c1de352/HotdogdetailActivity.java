package md5ac80968e2550d11b0c9978f27c1de352;


public class HotdogdetailActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Rugaciuni.HotdogdetailActivity, Rugaciuni, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", HotdogdetailActivity.class, __md_methods);
	}


	public HotdogdetailActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == HotdogdetailActivity.class)
			mono.android.TypeManager.Activate ("Rugaciuni.HotdogdetailActivity, Rugaciuni, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
