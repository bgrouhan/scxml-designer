package scxmlDiagram.design;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3._2005._07.scxml.ScxmlDataType;
import org.w3._2005._07.scxml.ScxmlTransitionType;


public class LabelParser {
	// transition labels are in the form : "[cond]event" where [cond] and event are optionnal
	private static String REGEX1 = "^(\\s*\\[\\s*\\w+\\s*\\])?\\s*[\\w\\.]*\\s*$";
	// data labels are in the form : "id=expr"
	private static String REGEX2 = "^\\s*\\w+\\s*=\\s*\\w+\\s*$";
	
	public LabelParser(){}
	
	public String getEventTransition(ScxmlTransitionType obj, String label, String oldEvent){
		String ret = oldEvent;
		Pattern p = Pattern.compile(REGEX1);
		Matcher m = p.matcher(label);
		if (m.matches()){
			String event = label.substring(label.indexOf("]")+1);
			ret = event.trim();
		}
		return ret;
	}
	
	public String getCondTransition(ScxmlTransitionType obj, String label, String oldCond){
		String ret = oldCond;
		Pattern p = Pattern.compile(REGEX1);
		Matcher m = p.matcher(label);
		if (m.matches()){
			if (label.indexOf("[")<0){
				ret = "";
			}
			else{
				String cond = label.substring(label.indexOf("[")+1, label.indexOf("]"));
				ret = cond.trim();
			}
		}
		return ret;
	}
	
	public String getIdData(ScxmlDataType obj, String label, String oldId){
		String ret = oldId;
		Pattern p = Pattern.compile(REGEX2);
		Matcher m = p.matcher(label);
		if (m.matches()){
			String id = label.substring(0, label.indexOf("="));
			ret = id.trim();
		}
		return ret;
	}
	
	public String getExprData(ScxmlDataType obj, String label, String oldExpr){
		String ret = oldExpr;
		Pattern p = Pattern.compile(REGEX2);
		Matcher m = p.matcher(label);
		if (m.matches()){
			String expr = label.substring(label.indexOf("=")+1);
			ret = expr.trim();
		}
		return ret;
	}
}
