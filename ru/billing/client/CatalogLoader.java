package billing.client;

import billing.stocklist.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat);
}
