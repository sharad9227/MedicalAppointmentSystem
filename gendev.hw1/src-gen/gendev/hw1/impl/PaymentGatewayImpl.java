/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Hw1Package;
import gendev.hw1.PaymentGateway;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PaymentGatewayImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentGatewayImpl#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentGatewayImpl#isPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayImpl extends MinimalEObjectImpl.Container implements PaymentGateway {
	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointment;

	/**
	 * The default value of the '{@link #getPaidAmount() <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PAID_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPaidAmount() <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected float paidAmount = PAID_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAYMENT_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PAYMENT_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentStatus(boolean newPaymentStatus) {
		boolean oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT_GATEWAY__PAYMENT_STATUS,
					oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectWithInverseResolvingEList<Appointment>(Appointment.class, this,
					Hw1Package.PAYMENT_GATEWAY__APPOINTMENT, Hw1Package.APPOINTMENT__PAYMENT);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPaidAmount() {
		return paidAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaidAmount(float newPaidAmount) {
		float oldPaidAmount = paidAmount;
		paidAmount = newPaidAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT_GATEWAY__PAID_AMOUNT,
					oldPaidAmount, paidAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppointment()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			return ((InternalEList<?>) getAppointment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			return getAppointment();
		case Hw1Package.PAYMENT_GATEWAY__PAID_AMOUNT:
			return getPaidAmount();
		case Hw1Package.PAYMENT_GATEWAY__PAYMENT_STATUS:
			return isPaymentStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			getAppointment().clear();
			getAppointment().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Hw1Package.PAYMENT_GATEWAY__PAID_AMOUNT:
			setPaidAmount((Float) newValue);
			return;
		case Hw1Package.PAYMENT_GATEWAY__PAYMENT_STATUS:
			setPaymentStatus((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			getAppointment().clear();
			return;
		case Hw1Package.PAYMENT_GATEWAY__PAID_AMOUNT:
			setPaidAmount(PAID_AMOUNT_EDEFAULT);
			return;
		case Hw1Package.PAYMENT_GATEWAY__PAYMENT_STATUS:
			setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.PAYMENT_GATEWAY__APPOINTMENT:
			return appointment != null && !appointment.isEmpty();
		case Hw1Package.PAYMENT_GATEWAY__PAID_AMOUNT:
			return paidAmount != PAID_AMOUNT_EDEFAULT;
		case Hw1Package.PAYMENT_GATEWAY__PAYMENT_STATUS:
			return paymentStatus != PAYMENT_STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (paidAmount: ");
		result.append(paidAmount);
		result.append(", paymentStatus: ");
		result.append(paymentStatus);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayImpl
