

/* First created by JCasGen Thu Oct 10 12:32:16 CEST 2019 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.tcas.Annotation;


/** an embedding for a word, phrase or sentence
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Embedding extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Embedding";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Embedding.class);
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
   
  public final static String _FeatName_vector = "vector";
  public final static String _FeatName_annotation = "annotation";
  public final static String _FeatName_source = "source";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_vector = TypeSystemImpl.createCallSite(Embedding.class, "vector");
  private final static MethodHandle _FH_vector = _FC_vector.dynamicInvoker();
  private final static CallSite _FC_annotation = TypeSystemImpl.createCallSite(Embedding.class, "annotation");
  private final static MethodHandle _FH_annotation = _FC_annotation.dynamicInvoker();
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(Embedding.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Embedding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Embedding(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Embedding(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Embedding(JCas jcas, int begin, int end) {
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
  //* Feature: vector

  /** getter for vector - gets the embedding vector
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getVector() { 
    return (DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)));
  }
    
  /** setter for vector - sets the embedding vector 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(DoubleArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_vector), v);
  }    
    
    
  /** indexed getter for vector - gets an indexed value - the embedding vector
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getVector(int i) {
     return ((DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)))).get(i);
  } 

  /** indexed setter for vector - sets an indexed value - the embedding vector
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVector(int i, double v) {
    ((DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets the annotation this embedding pertains to
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnnotation() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_annotation)));
  }
    
  /** setter for annotation - sets the annotation this embedding pertains to 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotation(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_annotation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets where the embedding came from, e.g. 'word2vec'
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_source));
  }
    
  /** setter for source - sets where the embedding came from, e.g. 'word2vec' 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_source), v);
  }    
    
  }

    