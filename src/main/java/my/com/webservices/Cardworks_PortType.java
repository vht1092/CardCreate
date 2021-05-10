/**
 * Cardworks_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public interface Cardworks_PortType extends java.rmi.Remote {
    public my.com.webservices.CardReloadRespBean cardReload(my.com.webservices.CardReloadReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.RedeemRewardRespBean rewardAdjustment(my.com.webservices.RedeemRewardReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.HostSignOnRespBean hostSignOn(my.com.webservices.HostSignOnReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.RewardEnquiryRespBean rewardEnquiry(my.com.webservices.RewardEnquiryReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.CardProfileMaintRespBean cardProfileMaintenance(my.com.webservices.CardProfileMaintReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.CardAdjustmentRespBean cardAdjustment(my.com.webservices.CardAdjustmentReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.DirectDebitRespBean directDebit(my.com.webservices.DirectDebitReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.PINSelectionRespBean PINSelection(my.com.webservices.PINSelectionReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.LimitMngmtRespBean limitMngmt(my.com.webservices.LimitMngmtReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.CardRenewReplRespBean cardRenewRepl(my.com.webservices.CardRenewReplReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.CardCreationRespBean cardCreation(my.com.webservices.CardCreationReqBean in0) throws java.rmi.RemoteException;
    public my.com.webservices.CardActivationRespBean cardActivation(my.com.webservices.CardActivationReqBean in0) throws java.rmi.RemoteException;
}
