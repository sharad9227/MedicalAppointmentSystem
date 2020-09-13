/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.PaymentGateway#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.PaymentGateway#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link gendev.hw1.PaymentGateway#isPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPaymentGateway()
 * @model
 * @generated
 */
public interface PaymentGateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see #setPaymentStatus(boolean)
	 * @see gendev.hw1.Hw1Package#getPaymentGateway_PaymentStatus()
	 * @model
	 * @generated
	 */
	boolean isPaymentStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.PaymentGateway#isPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see #isPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Appointment}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Appointment#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getPaymentGateway_Appointment()
	 * @see gendev.hw1.Appointment#getPayment
	 * @model opposite="payment" required="true"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * Returns the value of the '<em><b>Paid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Amount</em>' attribute.
	 * @see #setPaidAmount(float)
	 * @see gendev.hw1.Hw1Package#getPaymentGateway_PaidAmount()
	 * @model
	 * @generated
	 */
	float getPaidAmount();

	/**
	 * Sets the value of the '{@link gendev.hw1.PaymentGateway#getPaidAmount <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Amount</em>' attribute.
	 * @see #getPaidAmount()
	 * @generated
	 */
	void setPaidAmount(float value);

} // PaymentGateway
