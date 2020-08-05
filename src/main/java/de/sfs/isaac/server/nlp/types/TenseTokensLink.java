

/* First created by JCasGen Mon May 15 16:50:44 CEST 2017 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;


/** a link to one of the tokens participating in a tense annotation
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class TenseTokensLink extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.TenseTokensLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TenseTokensLink.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_role = "role";
  public final static String _FeatName_target = "target";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_role = TypeSystemImpl.createCallSite(TenseTokensLink.class, "role");
  private final static MethodHandle _FH_role = _FC_role.dynamicInvoker();
  private final static CallSite _FC_target = TypeSystemImpl.createCallSite(TenseTokensLink.class, "target");
  private final static MethodHandle _FH_target = _FC_target.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected TenseTokensLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TenseTokensLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TenseTokensLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets the role name, in this case the surface word
   * @generated
   * @return value of the feature 
   */
  public String getRole() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_role));
  }
    
  /** setter for role - sets the role name, in this case the surface word 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_role), v);
  }    
    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets the target annotation
   * @generated
   * @return value of the feature 
   */
  public Token getTarget() { 
    return (Token)(_getFeatureValueNc(wrapGetIntCatchException(_FH_target)));
  }
    
  /** setter for target - sets the target annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Token v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_target), v);
  }    
    
  }

    