

/* First created by JCasGen Tue May 15 15:45:17 CEST 2018 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** an annotation that can be mapped to another one
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class MappableAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.MappableAnnotation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MappableAnnotation.class);
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
   
  public final static String _FeatName_base = "base";
  public final static String _FeatName_doMap = "doMap";
  public final static String _FeatName_alignmentCandidates = "alignmentCandidates";
  public final static String _FeatName_match = "match";
  public final static String _FeatName_tfidfScore = "tfidfScore";
  public final static String _FeatName_whenIntroduced = "whenIntroduced";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_base = TypeSystemImpl.createCallSite(MappableAnnotation.class, "base");
  private final static MethodHandle _FH_base = _FC_base.dynamicInvoker();
  private final static CallSite _FC_doMap = TypeSystemImpl.createCallSite(MappableAnnotation.class, "doMap");
  private final static MethodHandle _FH_doMap = _FC_doMap.dynamicInvoker();
  private final static CallSite _FC_alignmentCandidates = TypeSystemImpl.createCallSite(MappableAnnotation.class, "alignmentCandidates");
  private final static MethodHandle _FH_alignmentCandidates = _FC_alignmentCandidates.dynamicInvoker();
  private final static CallSite _FC_match = TypeSystemImpl.createCallSite(MappableAnnotation.class, "match");
  private final static MethodHandle _FH_match = _FC_match.dynamicInvoker();
  private final static CallSite _FC_tfidfScore = TypeSystemImpl.createCallSite(MappableAnnotation.class, "tfidfScore");
  private final static MethodHandle _FH_tfidfScore = _FC_tfidfScore.dynamicInvoker();
  private final static CallSite _FC_whenIntroduced = TypeSystemImpl.createCallSite(MappableAnnotation.class, "whenIntroduced");
  private final static MethodHandle _FH_whenIntroduced = _FC_whenIntroduced.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected MappableAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MappableAnnotation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MappableAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MappableAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: base

  /** getter for base - gets the base for this mappable annotation
   * @generated
   * @return value of the feature 
   */
  public Annotation getBase() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_base)));
  }
    
  /** setter for base - sets the base for this mappable annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_base), v);
  }    
    
   
    
  //*--------------*
  //* Feature: doMap

  /** getter for doMap - gets whether to map this annotation
   * @generated
   * @return value of the feature 
   */
  public boolean getDoMap() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_doMap));
  }
    
  /** setter for doMap - sets whether to map this annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDoMap(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_doMap), v);
  }    
    
   
    
  //*--------------*
  //* Feature: alignmentCandidates

  /** getter for alignmentCandidates - gets a list of candidates to align to
   * @generated
   * @return value of the feature 
   */
  public FSArray getAlignmentCandidates() { 
    return (FSArray<AnnotationMapping>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_alignmentCandidates)));
  }
    
  /** setter for alignmentCandidates - sets a list of candidates to align to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlignmentCandidates(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_alignmentCandidates), v);
  }    
    
    
  /** indexed getter for alignmentCandidates - gets an indexed value - a list of candidates to align to
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationMapping getAlignmentCandidates(int i) {
     return (AnnotationMapping)(((FSArray<AnnotationMapping>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_alignmentCandidates)))).get(i));
  } 

  /** indexed setter for alignmentCandidates - sets an indexed value - a list of candidates to align to
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAlignmentCandidates(int i, AnnotationMapping v) {
    ((FSArray<AnnotationMapping>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_alignmentCandidates)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: match

  /** getter for match - gets the selected match for this annotation
   * @generated
   * @return value of the feature 
   */
  public AnnotationMapping getMatch() { 
    return (AnnotationMapping)(_getFeatureValueNc(wrapGetIntCatchException(_FH_match)));
  }
    
  /** setter for match - sets the selected match for this annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatch(AnnotationMapping v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_match), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tfidfScore

  /** getter for tfidfScore - gets the tfidf score of a mapped token
   * @generated
   * @return value of the feature 
   */
  public double getTfidfScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_tfidfScore));
  }
    
  /** setter for tfidfScore - sets the tfidf score of a mapped token 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTfidfScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_tfidfScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: whenIntroduced

  /** getter for whenIntroduced - gets indicates when a word has been introduced in the school book
   * @generated
   * @return value of the feature 
   */
  public String getWhenIntroduced() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_whenIntroduced));
  }
    
  /** setter for whenIntroduced - sets indicates when a word has been introduced in the school book 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWhenIntroduced(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_whenIntroduced), v);
  }    
    
  }

    