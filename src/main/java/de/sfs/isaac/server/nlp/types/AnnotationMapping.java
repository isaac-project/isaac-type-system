

/* First created by JCasGen Tue May 15 17:12:43 CEST 2018 */
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


/** a mapping from one annotation to another
 * Updated by JCasGen Tue Apr 14 16:08:06 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class AnnotationMapping extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.AnnotationMapping";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationMapping.class);
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
   
  public final static String _FeatName_label = "label";
  public final static String _FeatName_score = "score";
  public final static String _FeatName_sublabel = "sublabel";
  public final static String _FeatName_target = "target";
  public final static String _FeatName_numOverlaps = "numOverlaps";
  public final static String _FeatName_relations = "relations";
  public final static String _FeatName_source = "source";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(AnnotationMapping.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_score = TypeSystemImpl.createCallSite(AnnotationMapping.class, "score");
  private final static MethodHandle _FH_score = _FC_score.dynamicInvoker();
  private final static CallSite _FC_sublabel = TypeSystemImpl.createCallSite(AnnotationMapping.class, "sublabel");
  private final static MethodHandle _FH_sublabel = _FC_sublabel.dynamicInvoker();
  private final static CallSite _FC_target = TypeSystemImpl.createCallSite(AnnotationMapping.class, "target");
  private final static MethodHandle _FH_target = _FC_target.dynamicInvoker();
  private final static CallSite _FC_numOverlaps = TypeSystemImpl.createCallSite(AnnotationMapping.class, "numOverlaps");
  private final static MethodHandle _FH_numOverlaps = _FC_numOverlaps.dynamicInvoker();
  private final static CallSite _FC_relations = TypeSystemImpl.createCallSite(AnnotationMapping.class, "relations");
  private final static MethodHandle _FH_relations = _FC_relations.dynamicInvoker();
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(AnnotationMapping.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationMapping() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnnotationMapping(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationMapping(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationMapping(JCas jcas, int begin, int end) {
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
  //* Feature: label

  /** getter for label - gets the label/type of this mapping, e.g. synonym
   * @generated
   * @return value of the feature 
   */
  public String getLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }
    
  /** setter for label - sets the label/type of this mapping, e.g. synonym 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }    
    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets the mapping's numeric score, if any
   * @generated
   * @return value of the feature 
   */
  public double getScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_score));
  }
    
  /** setter for score - sets the mapping's numeric score, if any 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_score), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sublabel

  /** getter for sublabel - gets additional information about this mapping, e.g. POS type
   * @generated
   * @return value of the feature 
   */
  public String getSublabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_sublabel));
  }
    
  /** setter for sublabel - sets additional information about this mapping, e.g. POS type 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSublabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_sublabel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets the target of this mapping
   * @generated
   * @return value of the feature 
   */
  public MappableAnnotation getTarget() { 
    return (MappableAnnotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_target)));
  }
    
  /** setter for target - sets the target of this mapping 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(MappableAnnotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_target), v);
  }    
    
   
    
  //*--------------*
  //* Feature: numOverlaps

  /** getter for numOverlaps - gets the number of overlaps associated with this candidate mapping
   * @generated
   * @return value of the feature 
   */
  public int getNumOverlaps() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_numOverlaps));
  }
    
  /** setter for numOverlaps - sets the number of overlaps associated with this candidate mapping 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumOverlaps(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_numOverlaps), v);
  }    
    
   
    
  //*--------------*
  //* Feature: relations

  /** getter for relations - gets the types of relations associated with this mapping
   * @generated
   * @return value of the feature 
   */
  public StringArray getRelations() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)));
  }
    
  /** setter for relations - sets the types of relations associated with this mapping 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelations(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_relations), v);
  }    
    
    
  /** indexed getter for relations - gets an indexed value - the types of relations associated with this mapping
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getRelations(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)))).get(i);
  } 

  /** indexed setter for relations - sets an indexed value - the types of relations associated with this mapping
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRelations(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets the source of this mapping
   * @generated
   * @return value of the feature 
   */
  public MappableAnnotation getSource() { 
    return (MappableAnnotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_source)));
  }
    
  /** setter for source - sets the source of this mapping 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(MappableAnnotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_source), v);
  }    
    
  }

    