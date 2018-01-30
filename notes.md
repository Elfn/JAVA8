##Hashcode
digère les données stockées dans une instance de la classe dans une valeur de hachage (en un entier signé 32-bit)

##List
 use list for storing non-unique objects as per insertion order
##Set
 use set for storing unique objects in random order
 
###HASHSET VS TREESET



HashSet is much faster than TreeSet (constant-time versus log-time for most operations like add, remove and contains) but offers no ordering guarantees like TreeSet.

#HashSet
class offers constant time performance for the basic operations (add, remove, contains and size).
it does not guarantee that the order of elements will remain constant over time
iteration performance depends on the initial capacity and the load factor of the HashSet.
It's quite safe to accept default load factor but you may want to specify an initial capacity that's about twice the size to which you expect the set to grow.
#TreeSet
guarantees log(n) time cost for the basic operations (add, remove and contains)
guarantees that elements of set will be sorted (ascending, natural, or the one specified by you via its constructor) (implements SortedSet)
doesn't offer any tuning parameters for iteration performance
offers a few handy methods to deal with the ordered set like first(), last(), headSet(), and tailSet() etc