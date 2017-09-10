package listeners;

import javax.swing.JPanel;

import persenter.PhoneItemPresenter;
import socketKx.PhoneItem;

public interface PhoneAllListeners {
	public void powerOffAll();
	public void reBootAll();
	public void backAll();
	public void homeAll();
	public void installAll();
	public void startMonitorAll();//��ʼ���.
	public void stopMonitorAll();//ֹͣ���.
	public void monitorScreenOffAll();//ֹͣ��ػ���,ֻ�ܲٿ�.
	public void monitorScreenOnAll();//��ʼ��ػ���,Ҳ�ܲٿ�.
	public void initServerSocketAll();
	public JPanel initPhoneListAll(JPanel jpPhoneList, PhoneItemPresenter pip);
	public void removePhone(String phoneIp, PhoneItem phoneItem);
	public void addPhone(String phoneIp, PhoneItem phoneItem);
}
