package com.deepak.collectionInternalImplementation;

class MyHashMap {

	private Entry[] element;
	private int capacity = 0;
	// int index;

	public MyHashMap() {
		capacity = 16;
		element = new Entry[capacity];
	}

	static class Entry {
		final String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
			next = null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return key;
		}
	}

	public void put(String key, String value) {
		if (key == null) {
			putForNullKey(key, value);
		}
		int hash = hash(key.hashCode());
		int index = indexForBucket(hash, element.length);
		// System.out.println("put i :: " + i + " && " + element.length);
		Entry oldEntry = element[index];
		while (oldEntry != null) {
			if (oldEntry.getKey().equals(key)) {
				oldEntry.value = value;
				return;
			}
			oldEntry = oldEntry.next;
		}
		Entry newEntry = new Entry(key, value);
		newEntry.next = element[index];
		element[index] = newEntry;
	}

	private void putForNullKey(String key, String value) {
		Entry newEntry = new Entry(key, value);
		element[0] = newEntry;
	}

	/**
	 * Returns index for hash code h.
	 */
	static int indexForBucket(int h, int length) {
		return h & (length - 1);
	}

	public Entry get(String key) {
		if (key == null)
			return getForNullKey();
		int hash = hash(key.hashCode());
		int index = indexForBucket(hash, element.length);
		// System.out.println("index: " + index);
		Entry oldEntity = element[index];
		while (oldEntity != null) {
			if (oldEntity.key.equals(key)) {
				return oldEntity;
			}
			oldEntity = oldEntity.next;
		}
		return null;
	}

	private Entry getForNullKey() {
		for (Entry e = element[0]; e != null; e = e.next) {
			if (e.key == null)
				return e;
		}
		return null;
	}

	/*
	 * public int hashCode() { return index; }
	 */

	static int hash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}
	
	public void print()
	{   int i=1;
		Object temp=element[0].getKey();
		while(temp!=null)
		{
			System.out.println(" "+temp);
			++i;
			temp=element[i].getKey();
		}
	}

	public static void main(String[] args) {
		MyHashMap m = new MyHashMap();
		m.put("Deepak", "Job");
		m.put("Chandu", "DataTemplet");
		m.put("Ankit", "Tecleaver");
		m.put("Sumit", "Netzelous");
		m.put("Sumit", "Net");
		m.put("Sumit", "Net");
	  //  m.put(null, "Software");
	    //m.put(null, "Software");

		MyHashMap.Entry e1 = m.get("Deepak");
		System.out.println("Deepak :: " + e1.getValue());
		
		//m.print();
	}

}