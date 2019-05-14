
package Model;

import java.util.ArrayList;

/**
 *
 * @author Nx
 */
public class Term {
    private String term;
    private ArrayList<Posting> postingList = new ArrayList<Posting>();

    public Term(String term) {
        this.term = term;
    }

    public int getNumberOfDocument(){
        return postingList.size();
    }
    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the postingList
     */
    public ArrayList<Posting> getPostingList() {
        return postingList;
    }

    /**
     * @param postingList the postingList to set
     */
    public void setPostingList(ArrayList<Posting> postingList) {
        this.postingList = postingList;
    }

    @Override
    public int compareTo(Term o) {
        return term.compareToIgnoreCase(o.getTerm());
    }

    
}
