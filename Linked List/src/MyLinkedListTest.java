import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for MyLinkedList
 * @author AnselmJA20
 * @version 1.0
 */
public class MyLinkedListTest {
	private MyLinkedList<Integer> regular;
	
    
	/**
	 * tests
	 */
	@Before
	public void setUp() {
        regular = new MyLinkedList<Integer>();
        for ( Integer i = 1; i < 6; i++ ) {
            regular.add( i );
        }
        
    }
    
    /**
     * tests
     */
	@After
    public void tearDown() {
        regular = null;
    }
    
    // add( E e ) tests
    /**
     * test
     */
    @Test
    public void testAdd() {
        assertEquals( "[1, 2, 3, 4, 5]", regular.toString() );
    }
    
    // add( int index, E e ) tests
    /**
     * tests
     */
    @Test
    public void testAddReg() {
        regular.add( 2, 10 );
        assertEquals( "[1, 2, 10, 3, 4, 5]", regular.toString() );
    }
    
    /**
     * tests
     */
    @Test
    public void testAddRegMore() {
        regular.add( 4, 10 );
        assertEquals( "[1, 2, 3, 4, 10, 5]", regular.toString() );
    }
    
    // remove( Object o ) tests
    /**
     * tests
     */
    @Test
    public void testRemoveReg() {
        regular.remove( ( Object )2 );
        assertEquals( "[1, 3, 4, 5]", regular.toString() );
    }
    
    /**
     * tests
     */
    @Test
    public void testRemoveRegNotThere() {
        assertFalse( regular.remove( ( Object ) 10 ) );
        assertEquals( "[1, 2, 3, 4, 5]", regular.toString() );
    }
    
    // remove( int index ) tests
    /**
     * tests
     */
    @Test
    public void testRemoveRegIndex() {
        regular.remove( 1 );
        assertEquals( "[1, 3, 4, 5]", regular.toString() );
    }
    
    /**
     * tests
     */
    @Test
    public void testRemoveRegIndex2() {
        regular.remove( 2 );
        assertEquals( "[1, 2, 4, 5]", regular.toString() );
    }
    
    // get( int index ) tests
    /**
     * tests
     */
    @Test
    public void testGetRegular() {
        assertEquals( 3, ( Object )regular.get( 2 ) );
    }
    
    // set( int index, E obj ) tests
    /**
     * tests
     */
//    @Test
//    public void testSetRegular() {
//        regular.set( 2, 9 );
//        assertEquals( "[1, 2, 9, 4, 5]", regular.toString() );
//    }
}
