/**
 * CardworksSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package my.com.webservices;

public class CardworksSoapBindingStub extends org.apache.axis.client.Stub implements my.com.webservices.Cardworks_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardReload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadReqBean"), my.com.webservices.CardReloadReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadRespBean"));
        oper.setReturnClass(my.com.webservices.CardReloadRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardReloadReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardAdjustment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardReqBean"), my.com.webservices.RedeemRewardReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardRespBean"));
        oper.setReturnClass(my.com.webservices.RedeemRewardRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rewardAdjustmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hostSignOn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "HostSignOnReqBean"), my.com.webservices.HostSignOnReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "HostSignOnRespBean"));
        oper.setReturnClass(my.com.webservices.HostSignOnRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "hostSignOnReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardEnquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryReqBean"), my.com.webservices.RewardEnquiryReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryRespBean"));
        oper.setReturnClass(my.com.webservices.RewardEnquiryRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rewardEnquiryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardProfileMaintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardProfileMaintReqBean"), my.com.webservices.CardProfileMaintReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardProfileMaintRespBean"));
        oper.setReturnClass(my.com.webservices.CardProfileMaintRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardProfileMaintenanceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardAdjustment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardAdjustmentReqBean"), my.com.webservices.CardAdjustmentReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardAdjustmentRespBean"));
        oper.setReturnClass(my.com.webservices.CardAdjustmentRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardAdjustmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directDebit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "DirectDebitReqBean"), my.com.webservices.DirectDebitReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "DirectDebitRespBean"));
        oper.setReturnClass(my.com.webservices.DirectDebitRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "directDebitReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PINSelection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "PINSelectionReqBean"), my.com.webservices.PINSelectionReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "PINSelectionRespBean"));
        oper.setReturnClass(my.com.webservices.PINSelectionRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PINSelectionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("limitMngmt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "LimitMngmtReqBean"), my.com.webservices.LimitMngmtReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "LimitMngmtRespBean"));
        oper.setReturnClass(my.com.webservices.LimitMngmtRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "limitMngmtReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardRenewRepl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardRenewReplReqBean"), my.com.webservices.CardRenewReplReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardRenewReplRespBean"));
        oper.setReturnClass(my.com.webservices.CardRenewReplRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardRenewReplReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardCreation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardCreationReqBean"), my.com.webservices.CardCreationReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardCreationRespBean"));
        oper.setReturnClass(my.com.webservices.CardCreationRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardCreationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cardActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardActivationReqBean"), my.com.webservices.CardActivationReqBean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardActivationRespBean"));
        oper.setReturnClass(my.com.webservices.CardActivationRespBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cardActivationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

    }

    public CardworksSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CardworksSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CardworksSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardActivationReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardActivationReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardActivationRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardActivationRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardAdjustmentReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardAdjustmentReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardAdjustmentRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardAdjustmentRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardCreationReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardCreationReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardCreationRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardCreationRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardProfileMaintReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardProfileMaintReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardProfileMaintRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardProfileMaintRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardReloadReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardReloadRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardReloadRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardRenewReplReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardRenewReplReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "CardRenewReplRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.CardRenewReplRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "DirectDebitReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.DirectDebitReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "DirectDebitRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.DirectDebitRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "HostSignOnReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.HostSignOnReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "HostSignOnRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.HostSignOnRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "LimitMngmtReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.LimitMngmtReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "LimitMngmtRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.LimitMngmtRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "PINSelectionReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.PINSelectionReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "PINSelectionRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.PINSelectionRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RedeemRewardReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RedeemRewardRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RedeemRewardRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPanItems");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryPanItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPntItems");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryPntItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryReqBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryReqBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryRespBean");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryRespBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:webservices.com.my", "ArrayOf_tns2_RewardEnquiryPanItems");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryPanItems[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPanItems");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:webservices.com.my", "ArrayOf_tns2_RewardEnquiryPntItems");
            cachedSerQNames.add(qName);
            cls = my.com.webservices.RewardEnquiryPntItems[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.webservices.com.my", "RewardEnquiryPntItems");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public my.com.webservices.CardReloadRespBean cardReload(my.com.webservices.CardReloadReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardReload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardReloadRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardReloadRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardReloadRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.RedeemRewardRespBean rewardAdjustment(my.com.webservices.RedeemRewardReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "rewardAdjustment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.RedeemRewardRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.RedeemRewardRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.RedeemRewardRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.HostSignOnRespBean hostSignOn(my.com.webservices.HostSignOnReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "hostSignOn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.HostSignOnRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.HostSignOnRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.HostSignOnRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.RewardEnquiryRespBean rewardEnquiry(my.com.webservices.RewardEnquiryReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "rewardEnquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.RewardEnquiryRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.RewardEnquiryRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.RewardEnquiryRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.CardProfileMaintRespBean cardProfileMaintenance(my.com.webservices.CardProfileMaintReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardProfileMaintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardProfileMaintRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardProfileMaintRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardProfileMaintRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.CardAdjustmentRespBean cardAdjustment(my.com.webservices.CardAdjustmentReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardAdjustment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardAdjustmentRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardAdjustmentRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardAdjustmentRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.DirectDebitRespBean directDebit(my.com.webservices.DirectDebitReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "directDebit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.DirectDebitRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.DirectDebitRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.DirectDebitRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.PINSelectionRespBean PINSelection(my.com.webservices.PINSelectionReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "PINSelection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.PINSelectionRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.PINSelectionRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.PINSelectionRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.LimitMngmtRespBean limitMngmt(my.com.webservices.LimitMngmtReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "limitMngmt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.LimitMngmtRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.LimitMngmtRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.LimitMngmtRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.CardRenewReplRespBean cardRenewRepl(my.com.webservices.CardRenewReplReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardRenewRepl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardRenewReplRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardRenewReplRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardRenewReplRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.CardCreationRespBean cardCreation(my.com.webservices.CardCreationReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardCreation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardCreationRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardCreationRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardCreationRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public my.com.webservices.CardActivationRespBean cardActivation(my.com.webservices.CardActivationReqBean in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:webservices.com.my", "cardActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (my.com.webservices.CardActivationRespBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (my.com.webservices.CardActivationRespBean) org.apache.axis.utils.JavaUtils.convert(_resp, my.com.webservices.CardActivationRespBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
