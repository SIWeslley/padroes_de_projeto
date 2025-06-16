package br.com.wesguedesas.factory.app.dbadapter.factory;

import br.com.wesguedesas.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
