

   
/* Apache UIMA v3 - First created by JCasGen Tue May 05 16:38:55 CEST 2020 */

package de.sfs.isaac.server.nlp.types;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue May 05 16:38:55 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Answer extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Answer";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
   
  public final static String _FeatName_subtask_Id = "subtask_Id";
  public final static String _FeatName_taskfield_Id = "taskfield_Id";
  public final static String _FeatName_contentScore = "contentScore";
  public final static String _FeatName_contentDiagnosis = "contentDiagnosis";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_subtask_Id = TypeSystemImpl.createCallSite(Answer.class, "subtask_Id");
  private final static MethodHandle _FH_subtask_Id = _FC_subtask_Id.dynamicInvoker();
  private final static CallSite _FC_taskfield_Id = TypeSystemImpl.createCallSite(Answer.class, "taskfield_Id");
  private final static MethodHandle _FH_taskfield_Id = _FC_taskfield_Id.dynamicInvoker();
  private final static CallSite _FC_contentScore = TypeSystemImpl.createCallSite(Answer.class, "contentScore");
  private final static MethodHandle _FH_contentScore = _FC_contentScore.dynamicInvoker();
  private final static CallSite _FC_contentDiagnosis = TypeSystemImpl.createCallSite(Answer.class, "contentDiagnosis");
  private final static MethodHandle _FH_contentDiagnosis = _FC_contentDiagnosis.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Answer(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: subtask_Id

  /** getter for subtask_Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubtask_Id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subtask_Id));
  }
    
  /** setter for subtask_Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtask_Id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subtask_Id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: taskfield_Id

  /** getter for taskfield_Id - gets an identifier for the task field (item)
   * @generated
   * @return value of the feature 
   */
  public String getTaskfield_Id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_taskfield_Id));
  }
    
  /** setter for taskfield_Id - sets an identifier for the task field (item) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaskfield_Id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_taskfield_Id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contentScore

  /** getter for contentScore - gets a score or label for content appropriateness
   * @generated
   * @return value of the feature 
   */
  public String getContentScore() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contentScore));
  }
    
  /** setter for contentScore - sets a score or label for content appropriateness 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContentScore(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contentScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contentDiagnosis

  /** getter for contentDiagnosis - gets a content diagnosis, expressing e.g. whether something is missing
   * @generated
   * @return value of the feature 
   */
  public String getContentDiagnosis() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contentDiagnosis));
  }
    
  /** setter for contentDiagnosis - sets a content diagnosis, expressing e.g. whether something is missing 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContentDiagnosis(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contentDiagnosis), v);
  }    
    
  }

    