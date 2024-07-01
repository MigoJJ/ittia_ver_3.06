package je.panse.doro.chartplate;

import je.panse.doro.samsara.comm.datetime.Date_current;	
import je.panse.doro.soap.cc.EMR_ChangeStringCC;

public class EMR_ChangeString {

	public static String EMR_ChangeString(String lines) {
		    if (lines.contains(":(")) {
		        lines = EMR_ChangeStringCC.EMR_ChangeString_abr(lines); // Call the method from the EMR_ChangeString class to change the string
		    } else if (lines.contains(":>")) {
		        lines = EMR_ChangeStringCC.EMR_ChangeString_Px(lines); // Call the method from the EMR_ChangeString class to change the string
		    } else {
		    	
		    }
		
   	   String cdate = Date_current.main("d");
       String outputText = lines;

		outputText = outputText.replace(":cd ", cdate);
		outputText = outputText.replace(":call ", "- The patient received a lab results phone call notification from the doctor's office.");

		
		outputText = outputText.replace( ":d " , "diabetes mellitus ");
		outputText = outputText.replace( ":c " , "Hypercholesterolemia ");
		outputText = outputText.replace( ":tt " , "c/w Chronic Thyroiditis on USG ");
		outputText = outputText.replace( ":t " , "Hypertension ");
		outputText = outputText.replace( ":cd " , "Colonic diverticulum [  ] test ");
		outputText = outputText.replace( ":call " , "The patient received a lab results phone call notification from the doctor's office. ");
		outputText = outputText.replace( ":dr " , "DM with retinopathy ");
		outputText = outputText.replace( ":dn " , "DM with Nephropathy ");
		outputText = outputText.replace( ":dnp " , "DM with Peripheral Neuropathy ");
		outputText = outputText.replace( ":dna " , "DM with Autonomic Neuropathy ");
		outputText = outputText.replace( ":dp " , "Prediabetes ");
		outputText = outputText.replace( ":dg " , "Gestational Diabetes Mellitus ");
		outputText = outputText.replace( ":fd " , "Diabetes mellitus F/U ");
		outputText = outputText.replace( ":ft " , "Hypertension F/U ");
		outputText = outputText.replace( ":fc " , "Hypercholesterolemia F/U ");
		outputText = outputText.replace( ":fctg " , "HyperTriGlyceridemia F/U ");
		outputText = outputText.replace( ":fte " , "Hyperthyroidism F/U ");
		outputText = outputText.replace( ":fto " , "Hypothyroidism F/U ");
		outputText = outputText.replace( ":fnti " , "Non-Thyroidal Illness F/U ");
		outputText = outputText.replace( ":ftep " , "Hyperthyroidism with Pregnancy [ ] weeks F/U ");
		outputText = outputText.replace( ":ftop " , "Hypothyroidism with Pregnancy [ ] weeks F/U ");
		outputText = outputText.replace( ":do " , "DM without complications ");
		outputText = outputText.replace( ":drn " , "DM with Retinopathy : Non-proliferative diabetic retinopathy ");
		outputText = outputText.replace( ":drp " , "DM with Retinopathy : Proliferative diabetic retinopathy ");
		outputText = outputText.replace( ":drm " , "DM with Retinopathy : Macular edema ");
		outputText = outputText.replace( ":dnm " , "DM with Nephropathy with microalbuminuria ");
		outputText = outputText.replace( ":dnc " , "DM with Nephropathy with CRF ");
		outputText = outputText.replace( ":da " , "DM with Autonomic Neuropathy ");
		outputText = outputText.replace( ":pd " , "Prediabetes ");
		outputText = outputText.replace( ":pg " , "Gestational Diabetes Mellitus ");
		outputText = outputText.replace( ":ctg " , "HyperTriGlyceridemia ");
		outputText = outputText.replace( ":te " , "Hyperthyroidism  ");
		outputText = outputText.replace( ":to " , "Hypothyroidism  ");
		outputText = outputText.replace( ":ts " , "C/W Subacute Thyroiditis ");
		outputText = outputText.replace( ":tn " , "Thyroid nodule ");
		outputText = outputText.replace( ":tc " , "Thyroid cyst ");
		outputText = outputText.replace( ":tsg " , "Simple Goiter ");
		outputText = outputText.replace( ":at " , "Atypical Chest pain ");
		outputText = outputText.replace( ":ap " , "Angina Pectoris ");
		outputText = outputText.replace( ":aps " , "Angina Pectoris with stent insertion ");
		outputText = outputText.replace( ":omi " , "R/O Old Myocardial Infarction  ");
		outputText = outputText.replace( ":ami " , "Acute Myocardial Infarction ");
		outputText = outputText.replace( ":amis " , "Acute Myocardial Infarction with stent insertion ");
		outputText = outputText.replace( ":as " , "Artherosclerosis Carotid artery ");
		outputText = outputText.replace( ":asa " , "Artherosclerosis Carotid artery and Aorta ");
		outputText = outputText.replace( ":af " , "Atrial Fibrillation ");
		outputText = outputText.replace( ":afr " , "Atrial Fibrillation with RVR ");
		outputText = outputText.replace( ":afl " , "Atrial Flutter ");
		outputText = outputText.replace( ":pvc " , "PVC Premature Ventricular Contractions ");
		outputText = outputText.replace( ":apc " , "APC atrial premature complexes ");
		outputText = outputText.replace( ":gre " , "Reflux esophagitis ");
		outputText = outputText.replace( ":gcag " , "Chronic Atrophic Gastritis ");
		outputText = outputText.replace( ":gcsg " , "Chronic Superficial Gastritis ");
		outputText = outputText.replace( ":geg " , "r/o Erosive Gastritis ");
		outputText = outputText.replace( ":gibs " , "r/o Irritable Bowel Syndrome ");
		outputText = outputText.replace( ":ggil " , "Gilbert's syndrome ");
		outputText = outputText.replace( ":gcon " , "Severe Constipation ");
		outputText = outputText.replace( ":nti " , "Non-Thyroidal Illness ");
		outputText = outputText.replace( ":tep " , "Hyperthyroidism with Pregnancy [    ] weeks ");
		outputText = outputText.replace( ":top " , "Hypothyroidism with Pregnancy [     ] weeks ");
		outputText = outputText.replace( ":tco " , "Papillary Thyroid Cancer OP(+) Hypothyroidism ");
		outputText = outputText.replace( ":tcor " , "Papillary Thyroid Cancer OP(+) RAI Tx(+) Hypothyroidism ");
		outputText = outputText.replace( ":sos " , "Severe Osteoporosis ");
		outputText = outputText.replace( ":os " , "Osteoporosis ");
		outputText = outputText.replace( ":ospe " , "Osteopenia ");
		outputText = outputText.replace( ":cp " , "Colonic Polyp ");
		outputText = outputText.replace( ":cpm " , "Colonic Polyps multiple ");
		outputText = outputText.replace( ":cps " , "Colonic Polyp single ");
		outputText = outputText.replace( ":gp " , "GB polyp ");
		outputText = outputText.replace( ":gs " , "GB stone ");
		outputText = outputText.replace( ":ggp " , "Gastric Polyp ");
		outputText = outputText.replace( ":oc " , "s/p Cholecystectomy d/t GB stone ");
		outputText = outputText.replace( ":oa " , "s/p Appendectomy ");
		outputText = outputText.replace( ":occ " , "s/p Colon cancer op(+) ");
		outputText = outputText.replace( ":ogc " , "s/p Gastric cancer cancer op(+) ");
		outputText = outputText.replace( ":oh " , "s/p TAH : Total Abdominal Hysterectomy ");
		outputText = outputText.replace( ":oho " , "s/p TAH with BSO ");
		outputText = outputText.replace( ":bph " , "BPH ");
		outputText = outputText.replace( ":op " , "Prostate cancer operation(+) ");
		outputText = outputText.replace( ":ob " , "s/p Breast Cancer Operation ");
		outputText = outputText.replace( ":ot " , "Papillary Thyroid Cancer OP(+)	with Hypothyroidism ");
		outputText = outputText.replace( ":oca " , "Cataract OP(+) ");
		outputText = outputText.replace( ":hav " , "s/p Hepatitis A infection ");
		outputText = outputText.replace( ":hbv " , "HBsAg(+) Carrier ");
		outputText = outputText.replace( ":hcv " , "Hepatitis C virus (HCV) chronic infection ");
		outputText = outputText.replace( ":hcvp " , "HCV-Ab(Positive) --> PCR(Negative) confirmed ");
		outputText = outputText.replace( ":hh " , "Hepatic Hemangioma ");
		outputText = outputText.replace( ":hc " , "Hepatic Cyst ");
		outputText = outputText.replace( ":hn " , "Hepatic Nodule ");
		outputText = outputText.replace( ":hhn " , "Hepatic higher echoic nodule ");
		outputText = outputText.replace( ":hf " , "Fatty Liver ");
		outputText = outputText.replace( ":hfmi " , "Mild Fatty Liver ");
		outputText = outputText.replace( ":hfmo " , "Moderate Fatty Liver ");
		outputText = outputText.replace( ":hfse " , "Severe Fatty Liver ");
		outputText = outputText.replace( ":rc " , "Renal Cyst ");
		outputText = outputText.replace( ":rs " , "Renal Stone ");
		outputText = outputText.replace( ":rse " , "Renal Stone s/p ESWL ");
		outputText = outputText.replace( ":rn " , "Renal Nodule ");
		outputText = outputText.replace( ":rih " , "isolated hematuria ");
		outputText = outputText.replace( ":rgh " , "gross hematuria ");
		outputText = outputText.replace( ":rip " , "isolated proteinuria ");
		outputText = outputText.replace( ":bc " , "Breast Cyst ");
		outputText = outputText.replace( ":bn " , "Breast Nodule ");
		outputText = outputText.replace( ":bnb " , "Breast Nodule with biopsy ");
		outputText = outputText.replace( ":bco " , "s/p Breast Cancer Operation ");
		outputText = outputText.replace( ":bcoc " , "s/p Breast Cancer Operation+ ChemoTx(+) ");
		outputText = outputText.replace( ":bcor " , "s/p Breast Cancer Operation + RT(+) ");
		outputText = outputText.replace( ":bcocr " , "s/p Breast Cancer Operation : ChemoTx(+) + RT(+) ");
		outputText = outputText.replace( ":ins " , "Insomnia ");
		outputText = outputText.replace( ":epi " , "Epigastric pain ");
		outputText = outputText.replace( ":dys " , "Dysuria and frequency ");
		outputText = outputText.replace( ":ind " , "Epigastric pain and Indigestion ");
		outputText = outputText.replace( ":dia " , "Diarrhea ");
		outputText = outputText.replace( ":con " , "Constipation ");
		outputText = outputText.replace( ":cov " , "COVID-19 PCR (+) ");
		outputText = outputText.replace( ":covc " , "s/p COVID-19 PCR (+) without complications [ ] ");
		outputText = outputText.replace( ":covs " , "s/p COVID-19 PCR (+) with complications [ ] ");
		outputText = outputText.replace( ":ver " , "Vertigo ");
		outputText = outputText.replace( ":hea " , "Headache ");
		outputText = outputText.replace( ":wei " , "Weight loss [ ] kg ");
		outputText = outputText.replace( ":weig " , "Weight gain [ ] kg ");
		outputText = outputText.replace( ":eas " , "Easy fatigue ");
		outputText = outputText.replace( ":obe " , "Obesity ");
		outputText = outputText.replace( ":obec " , "Central Obesity ");
		outputText = outputText.replace( ":gla " , "Glaucoma(+) ");
		outputText = outputText.replace( ":cat " , "Cataract(+) ");
		outputText = outputText.replace( ":cato " , "Cataract operation (+) [ ] ");
		outputText = outputText.replace( ":ida " , "Iron Deficiency Anemia ");
		outputText = outputText.replace( ":leu " , "Leukocytopenia ");
		outputText = outputText.replace( ":thr " , "Thrombocytopenia ");
		outputText = outputText.replace( ":got " , "GOT/GPT/GGT elevation ");
		outputText = outputText.replace( ":afp " , "AFP elevation ");
		outputText = outputText.replace( ":ca1 " , "CA19-9 elevation ");
		outputText = outputText.replace( ":her " , "Herpes Zoster ");
		outputText = outputText.replace( ":uti " , "Urinary Tract Infection ");
		outputText = outputText.replace( ":uri " , "Upper Respiratory Infection ");
		outputText = outputText.replace( ":gou " , "Gout ");
		outputText = outputText.replace( ":hiv " , "HIVD : herniated intervertebral disc ");
		outputText = outputText.replace( ":dep " , "Depression ");
		outputText = outputText.replace( ":anx " , "Anxiety disorder ");
		outputText = outputText.replace( ":cog " , "Cognitive Disorder ");
		outputText = outputText.replace( ":pa " , "s/p Bronchial Asthma ");
		outputText = outputText.replace( ":pc " , "Chronic Cough ");
		outputText = outputText.replace( ":pp " , "Pneumonia ");
		outputText = outputText.replace( ":pn " , "s/p Pulmonary Nodule ");
		outputText = outputText.replace( ":pt " , "s/p Pulmonary Tuberculosis ");
		outputText = outputText.replace( ":ntm " , "NTM : Nontuberculous Mycobacterial Pulmonary Disease ");
		outputText = outputText.replace( ":gr " , "GDS RC ");
		outputText = outputText.replace( ":grr " , "GDSRC Result Consultation ");
		outputText = outputText.replace( ":gg " , "공단검진 ");
		outputText = outputText.replace( ":ggr " , "공단검진 결과상담 ");
		outputText = outputText.replace( ":rr " , "Other clinic RC and Lab result consultation ");
		outputText = outputText.replace( ":SxTx " , "Symptomatic treatment and supportive care ");
		outputText = outputText.replace( ":teg " , "Hyperthyroidism : Greaves' disease ");
		outputText = outputText.replace( ":toh " , "Hypothyroidism : Hashimoto's thyroditis ");
		outputText = outputText.replace( ":aa " , "Astrix 100 mg 1 tab po qd ");
		outputText = outputText.replace( ":dn- " , "Dm without Nephropathy ");
		outputText = outputText.replace( ":migo " , "DR. Koh Jae Joon ");
		outputText = outputText.replace( ":jj " , "Migo JJ ");
		outputText = outputText.replace( ":df " , "Diabetes Mellitus F/U ");
		outputText = outputText.replace( ":tf " , "Hypertension F/U ");
		outputText = outputText.replace( ":cf " , "Hypercholwsterolemia F/U ");
		outputText = outputText.replace( ":tof " , "Hypothyroidism F/U ");
		outputText = outputText.replace( ":tef " , "Hyperthyroisidm F/U ");

                
                
    		    if (outputText.contains(":(")) {
    		    	outputText = EMR_ChangeStringCC.EMR_ChangeString_abr(outputText); // Call the method from the EMR_ChangeString class to change the string
    		    	
    		    } else if (outputText.contains(":>")) {
    		    	outputText = EMR_ChangeStringCC.EMR_ChangeString_Px(outputText); // Call the method from the EMR_ChangeString class to change the string
    		    }
		    
		return "  " + outputText;
	}
////------------------------------------------------
}
