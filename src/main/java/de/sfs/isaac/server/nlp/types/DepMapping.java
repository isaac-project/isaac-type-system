

/* First created by JCasGen Tue May 22 15:46:27 CEST 2018 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;


/** a mapping between dependencies
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class DepMapping extends AnnotationMapping {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.DepMapping";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DepMapping.class);
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
   
  public final static String _FeatName_sourceRel = "sourceRel";
  public final static String _FeatName_targetRel = "targetRel";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_sourceRel = TypeSystemImpl.createCallSite(DepMapping.class, "sourceRel");
  private final static MethodHandle _FH_sourceRel = _FC_sourceRel.dynamicInvoker();
  private final static CallSite _FC_targetRel = TypeSystemImpl.createCallSite(DepMapping.class, "targetRel");
  private final static MethodHandle _FH_targetRel = _FC_targetRel.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected DepMapping() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DepMapping(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DepMapping(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DepMapping(JCas jcas, int begin, int end) {
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
  //* Feature: sourceRel

  /** getter for sourceRel - gets the source of the mapping
   * @generated
   * @return value of the feature 
   */
  public Dependency getSourceRel() { 
    return (Dependency)(_getFeatureValueNc(wrapGetIntCatchException(_FH_sourceRel)));
  }
    
  /** setter for sourceRel - sets the source of the mapping 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceRel(Dependency v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_sourceRel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: targetRel

  /** getter for targetRel - gets the target relation
   * @generated
   * @return value of the feature 
   */
  public Dependency getTargetRel() { 
    return (Dependency)(_getFeatureValueNc(wrapGetIntCatchException(_FH_targetRel)));
  }
    
  /** setter for targetRel - sets the target relation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTargetRel(Dependency v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_targetRel), v);
  }    
    
  }

    