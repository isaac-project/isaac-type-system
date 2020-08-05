

/* First created by JCasGen Tue Aug 22 17:19:02 CEST 2017 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.IntegerArray;


/** a diagnosed language construct in an answer
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Diagnosis extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Diagnosis";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Diagnosis.class);
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
   
  public final static String _FeatName_form = "form";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_correctForm = "correctForm";
  public final static String _FeatName_correctValue = "correctValue";
  public final static String _FeatName_previous = "previous";
  public final static String _FeatName_conditions = "conditions";
  public final static String _FeatName_copied = "copied";
  public final static String _FeatName_deletedTokens = "deletedTokens";
  public final static String _FeatName_deletedTokenIndices = "deletedTokenIndices";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_form = TypeSystemImpl.createCallSite(Diagnosis.class, "form");
  private final static MethodHandle _FH_form = _FC_form.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(Diagnosis.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_correctForm = TypeSystemImpl.createCallSite(Diagnosis.class, "correctForm");
  private final static MethodHandle _FH_correctForm = _FC_correctForm.dynamicInvoker();
  private final static CallSite _FC_correctValue = TypeSystemImpl.createCallSite(Diagnosis.class, "correctValue");
  private final static MethodHandle _FH_correctValue = _FC_correctValue.dynamicInvoker();
  private final static CallSite _FC_previous = TypeSystemImpl.createCallSite(Diagnosis.class, "previous");
  private final static MethodHandle _FH_previous = _FC_previous.dynamicInvoker();
  private final static CallSite _FC_conditions = TypeSystemImpl.createCallSite(Diagnosis.class, "conditions");
  private final static MethodHandle _FH_conditions = _FC_conditions.dynamicInvoker();
  private final static CallSite _FC_copied = TypeSystemImpl.createCallSite(Diagnosis.class, "copied");
  private final static MethodHandle _FH_copied = _FC_copied.dynamicInvoker();
  private final static CallSite _FC_deletedTokens = TypeSystemImpl.createCallSite(Diagnosis.class, "deletedTokens");
  private final static MethodHandle _FH_deletedTokens = _FC_deletedTokens.dynamicInvoker();
  private final static CallSite _FC_deletedTokenIndices = TypeSystemImpl.createCallSite(Diagnosis.class, "deletedTokenIndices");
  private final static MethodHandle _FH_deletedTokenIndices = _FC_deletedTokenIndices.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Diagnosis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Diagnosis(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Diagnosis(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Diagnosis(JCas jcas, int begin, int end) {
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
  //* Feature: form

  /** getter for form - gets the surface form that constitutes this alternative
   * @generated
   * @return value of the feature 
   */
  public String getForm() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_form));
  }
    
  /** setter for form - sets the surface form that constitutes this alternative 
   * @generated
   * @param v value to set into the feature 
   */
  public void setForm(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_form), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets the metalinguistic description of the form
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets the metalinguistic description of the form 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: correctForm

  /** getter for correctForm - gets the correct version of the alternative
   * @generated
   * @return value of the feature 
   */
  public String getCorrectForm() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_correctForm));
  }
    
  /** setter for correctForm - sets the correct version of the alternative 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrectForm(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_correctForm), v);
  }    
    
   
    
  //*--------------*
  //* Feature: correctValue

  /** getter for correctValue - gets the metalinguistic description of the correct form
   * @generated
   * @return value of the feature 
   */
  public String getCorrectValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_correctValue));
  }
    
  /** setter for correctValue - sets the metalinguistic description of the correct form 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrectValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_correctValue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: previous

  /** getter for previous - gets the annotation that preceded this diagnosis before rule application, if any
   * @generated
   * @return value of the feature 
   */
  public Annotation getPrevious() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_previous)));
  }
    
  /** setter for previous - sets the annotation that preceded this diagnosis before rule application, if any 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrevious(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_previous), v);
  }    
    
   
    
  //*--------------*
  //* Feature: conditions

  /** getter for conditions - gets the list of construct/value pairs additionally found in this diagnosis, to be referenced by feedback template
   * @generated
   * @return value of the feature 
   */
  public FSArray getConditions() { 
    return (FSArray<KeyValuePair>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conditions)));
  }
    
  /** setter for conditions - sets the list of construct/value pairs additionally found in this diagnosis, to be referenced by feedback template 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditions(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_conditions), v);
  }    
    
    
  /** indexed getter for conditions - gets an indexed value - the list of construct/value pairs additionally found in this diagnosis, to be referenced by feedback template
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public KeyValuePair getConditions(int i) {
     return (KeyValuePair)(((FSArray<KeyValuePair>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conditions)))).get(i));
  } 

  /** indexed setter for conditions - sets an indexed value - the list of construct/value pairs additionally found in this diagnosis, to be referenced by feedback template
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setConditions(int i, KeyValuePair v) {
    ((FSArray<KeyValuePair>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conditions)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: copied

  /** getter for copied - gets whether this diagnosis was copied from a previous rule application
   * @generated
   * @return value of the feature 
   */
  public boolean getCopied() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_copied));
  }
    
  /** setter for copied - sets whether this diagnosis was copied from a previous rule application 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCopied(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_copied), v);
  }    
    
   
    
  //*--------------*
  //* Feature: deletedTokens

  /** getter for deletedTokens - gets a list of deleted tokens that must not be matched for this diagnosis to apply
   * @generated
   * @return value of the feature 
   */
  public StringArray getDeletedTokens() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokens)));
  }
    
  /** setter for deletedTokens - sets a list of deleted tokens that must not be matched for this diagnosis to apply 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDeletedTokens(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_deletedTokens), v);
  }    
    
    
  /** indexed getter for deletedTokens - gets an indexed value - a list of deleted tokens that must not be matched for this diagnosis to apply
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getDeletedTokens(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokens)))).get(i);
  } 

  /** indexed setter for deletedTokens - sets an indexed value - a list of deleted tokens that must not be matched for this diagnosis to apply
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDeletedTokens(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokens)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: deletedTokenIndices

  /** getter for deletedTokenIndices - gets a list of indices corresponding to deletedTokens
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getDeletedTokenIndices() { 
    return (IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokenIndices)));
  }
    
  /** setter for deletedTokenIndices - sets a list of indices corresponding to deletedTokens 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDeletedTokenIndices(IntegerArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_deletedTokenIndices), v);
  }    
    
    
  /** indexed getter for deletedTokenIndices - gets an indexed value - a list of indices corresponding to deletedTokens
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getDeletedTokenIndices(int i) {
     return ((IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokenIndices)))).get(i);
  } 

  /** indexed setter for deletedTokenIndices - sets an indexed value - a list of indices corresponding to deletedTokens
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDeletedTokenIndices(int i, int v) {
    ((IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_deletedTokenIndices)))).set(i, v);
  }  
  }

    