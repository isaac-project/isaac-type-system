

/* First created by JCasGen Tue May 15 16:26:35 CEST 2018 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** a collection of synonyms
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Synonyms extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Synonyms";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Synonyms.class);
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
   
  public final static String _FeatName_values = "values";
  public final static String _FeatName_synsets = "synsets";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_values = TypeSystemImpl.createCallSite(Synonyms.class, "values");
  private final static MethodHandle _FH_values = _FC_values.dynamicInvoker();
  private final static CallSite _FC_synsets = TypeSystemImpl.createCallSite(Synonyms.class, "synsets");
  private final static MethodHandle _FH_synsets = _FC_synsets.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Synonyms() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Synonyms(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Synonyms(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Synonyms(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: values

  /** getter for values - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getValues() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_values)));
  }
    
  /** setter for values - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValues(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_values), v);
  }    
    
    
  /** indexed getter for values - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getValues(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_values)))).get(i);
  } 

  /** indexed setter for values - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setValues(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_values)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: synsets

  /** getter for synsets - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getSynsets() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_synsets)));
  }
    
  /** setter for synsets - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSynsets(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_synsets), v);
  }    
    
    
  /** indexed getter for synsets - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSynsets(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_synsets)))).get(i);
  } 

  /** indexed setter for synsets - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSynsets(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_synsets)))).set(i, v);
  }  
  }

    