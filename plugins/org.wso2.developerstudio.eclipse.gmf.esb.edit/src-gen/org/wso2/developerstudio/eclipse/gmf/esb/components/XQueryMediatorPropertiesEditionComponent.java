/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.XQueryMediatorPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class XQueryMediatorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for variables ReferencesTable
	 */
	protected ReferencesTableSettings variablesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public XQueryMediatorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject xQueryMediator, String editing_mode) {
		super(editingContext, xQueryMediator, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EsbViewsRepository.class;
		partKey = EsbViewsRepository.XQueryMediator.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final XQueryMediator xQueryMediator = (XQueryMediator)elt;
			final XQueryMediatorPropertiesEditionPart basePart = (XQueryMediatorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, xQueryMediator.getDescription()));
			
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.commentsList))
				basePart.setCommentsList(xQueryMediator.getCommentsList());
			
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.reverse)) {
				basePart.setReverse(xQueryMediator.isReverse());
			}
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.variables)) {
				variablesSettings = new ReferencesTableSettings(xQueryMediator, EsbPackage.eINSTANCE.getXQueryMediator_Variables());
				basePart.initVariables(variablesSettings);
			}
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.scriptKeyType)) {
				basePart.initScriptKeyType(EEFUtils.choiceOfValues(xQueryMediator, EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType()), xQueryMediator.getScriptKeyType());
			}
			// init filters
			
			
			
			if (isAccessible(EsbViewsRepository.XQueryMediator.Properties.variables)) {
				basePart.addFilterToVariables(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof XQueryVariable); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for variables
				// End of user code
			}
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EsbViewsRepository.XQueryMediator.Properties.description) {
			return EsbPackage.eINSTANCE.getEsbElement_Description();
		}
		if (editorKey == EsbViewsRepository.XQueryMediator.Properties.commentsList) {
			return EsbPackage.eINSTANCE.getEsbElement_CommentsList();
		}
		if (editorKey == EsbViewsRepository.XQueryMediator.Properties.reverse) {
			return EsbPackage.eINSTANCE.getMediator_Reverse();
		}
		if (editorKey == EsbViewsRepository.XQueryMediator.Properties.variables) {
			return EsbPackage.eINSTANCE.getXQueryMediator_Variables();
		}
		if (editorKey == EsbViewsRepository.XQueryMediator.Properties.scriptKeyType) {
			return EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		XQueryMediator xQueryMediator = (XQueryMediator)semanticObject;
		if (EsbViewsRepository.XQueryMediator.Properties.description == event.getAffectedEditor()) {
			xQueryMediator.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.XQueryMediator.Properties.commentsList == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				xQueryMediator.getCommentsList().clear();
				xQueryMediator.getCommentsList().addAll(((EList) event.getNewValue()));
			}
		}
		if (EsbViewsRepository.XQueryMediator.Properties.reverse == event.getAffectedEditor()) {
			xQueryMediator.setReverse((Boolean)event.getNewValue());
		}
		if (EsbViewsRepository.XQueryMediator.Properties.variables == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, variablesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				variablesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				variablesSettings.move(event.getNewIndex(), (XQueryVariable) event.getNewValue());
			}
		}
		if (EsbViewsRepository.XQueryMediator.Properties.scriptKeyType == event.getAffectedEditor()) {
			xQueryMediator.setScriptKeyType((KeyType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			XQueryMediatorPropertiesEditionPart basePart = (XQueryMediatorPropertiesEditionPart)editingPart;
			if (EsbPackage.eINSTANCE.getEsbElement_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.XQueryMediator.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (EsbPackage.eINSTANCE.getEsbElement_CommentsList().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.XQueryMediator.Properties.commentsList)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setCommentsList((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setCommentsList(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setCommentsList(newValueAsList);
				}
			}
			
			if (EsbPackage.eINSTANCE.getMediator_Reverse().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.XQueryMediator.Properties.reverse))
				basePart.setReverse((Boolean)msg.getNewValue());
			
			if (EsbPackage.eINSTANCE.getXQueryMediator_Variables().equals(msg.getFeature()) && isAccessible(EsbViewsRepository.XQueryMediator.Properties.variables))
				basePart.updateVariables();
			if (EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(EsbViewsRepository.XQueryMediator.Properties.scriptKeyType))
				basePart.setScriptKeyType((KeyType)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EsbPackage.eINSTANCE.getEsbElement_Description(),
			EsbPackage.eINSTANCE.getEsbElement_CommentsList(),
			EsbPackage.eINSTANCE.getMediator_Reverse(),
			EsbPackage.eINSTANCE.getXQueryMediator_Variables(),
			EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EsbViewsRepository.XQueryMediator.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getEsbElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getEsbElement_Description().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.XQueryMediator.Properties.commentsList == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (EsbViewsRepository.XQueryMediator.Properties.reverse == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getMediator_Reverse().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getMediator_Reverse().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.XQueryMediator.Properties.scriptKeyType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}